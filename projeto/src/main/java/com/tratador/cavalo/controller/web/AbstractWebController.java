package com.tratador.cavalo.controller.web;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

public abstract class AbstractWebController<T> implements WebController {

    protected abstract <T, ID> JpaRepository<T, ID> getStorage();

    @Override
    public ResponseEntity<?> getById() {
        return null;
    }

    @Override
    public ResponseEntity<?> doNew() {
        return null;
    }

    @Override
    public ResponseEntity<?> doDelete() {
        return null;
    }

    @Override
    public ResponseEntity<?> doSave() {
        return null;
    }

    @Override
    public ResponseEntity<?> doUpdate() {
        return null;
    }
}
