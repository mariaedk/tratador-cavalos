package com.tratador.cavalo.controller.web;

import org.springframework.http.ResponseEntity;

public interface WebController {

    public ResponseEntity<?> getById();

    public ResponseEntity<?> doNew();

    public ResponseEntity<?> doDelete();

    public ResponseEntity<?> doSave();

    public ResponseEntity<?> doUpdate();
}
