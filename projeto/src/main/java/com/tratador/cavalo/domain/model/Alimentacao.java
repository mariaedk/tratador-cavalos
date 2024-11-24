package com.tratador.cavalo.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "alimentacao")
public class Alimentacao {

    @Id
    @Column(name = "id_alimentacao")
    @Getter
    private UUID id;

    @Column(name = "cd_alimentacao")
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "tp_alimentacao")
    @Getter @Setter
    @NotNull
    @Enumerated
    private TipoAlimentacao tipoAlimentacao;

    @Column(name = "dt_alimentacao")
    @Getter @Setter
    @NotNull
    private Date data;

    @OneToOne
    @JoinColumn(name = "cavalo_id")
    @Getter @Setter
    private Cavalo cavalo;
}
