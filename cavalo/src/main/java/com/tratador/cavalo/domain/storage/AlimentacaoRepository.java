package com.tratador.cavalo.domain.storage;

import com.tratador.cavalo.domain.model.Alimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlimentacaoRepository extends JpaRepository<Alimentacao, UUID> {
}
