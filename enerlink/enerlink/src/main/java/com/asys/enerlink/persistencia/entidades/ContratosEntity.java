package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


@Entity
    @Table(name = "Contratos")
    @Getter
    @Setter
    @NoArgsConstructor
    public class ContratosEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id contrato")
        private long id;

        private Date fechaInicio;
        private Date fechaFin;
        private Integer tarifa;

    }
