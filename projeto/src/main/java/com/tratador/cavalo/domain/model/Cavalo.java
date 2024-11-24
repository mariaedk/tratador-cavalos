package com.tratador.cavalo.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "cavalo")
public class Cavalo {

    @Id
    @Getter
    @Column(name = "id_cavalo")
    private UUID id;

    @Column(name = "cd_cavalo")
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "ds_nome", length = 100, nullable = false) @NotNull
    @Getter @Setter
    private String nome;

    @Column(name = "dt_aquisicao")
    @Getter @Setter
    private Date dataAquisicao;

    @Column(name = "nr_peso")
    @Getter @Setter
    private Double peso;

    @Column(name = "ds_raca")
    @Getter @Setter
    private String raça;

    @OneToOne(mappedBy = "cavalo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Getter @Setter
    private Alimentacao ultimaAlimentacao;
}
