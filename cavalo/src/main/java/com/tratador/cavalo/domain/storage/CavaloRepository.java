package com.tratador.cavalo.domain.storage;

import com.tratador.cavalo.domain.model.Cavalo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CavaloRepository extends JpaRepository<Cavalo, UUID> {
}
