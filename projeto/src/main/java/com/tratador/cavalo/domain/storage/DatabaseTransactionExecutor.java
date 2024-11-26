package com.tratador.cavalo.domain.storage;

import javax.persistence.EntityManager;
import java.util.function.Function;

public interface DatabaseTransactionExecutor {

    <T> T executeTransaction(Function<EntityManager, T> action);

    <T> T executeTransactionRead(Function<EntityManager, T> action);
}