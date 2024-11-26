package com.tratador.cavalo.domain.storage;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.function.Function;

@Service
public class DatabaseTransactionExecutorImpl implements DatabaseTransactionExecutor {

    public EntityManager getBDConnection() {
        return JPAUtil.getEntityManager();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public <T> T executeTransaction(Function<EntityManager, T> action) {
        return run(action);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
    public <T> T executeTransactionRead(Function<EntityManager, T> action) {
        return run(action);
    }

    private <T> T run(Function<EntityManager, T> action) {
        EntityManager entityManager = getBDConnection();
        try {
            return action.apply(entityManager);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao executar transação", e);
        } finally {
            if (entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }
}
