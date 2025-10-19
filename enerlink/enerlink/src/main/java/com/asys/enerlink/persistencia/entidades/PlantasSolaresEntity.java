package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
    @Table(name = "Plantas_Solares")
    @Getter
    @Setter
    @NoArgsConstructor
    public class PlantasSolaresEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id plantas_solares")
        private long id;

        private Date fechaInstalacion;
        private Integer capacidad;
        private String estado;

    }
