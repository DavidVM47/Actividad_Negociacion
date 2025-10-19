package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Entity
    @Table(name = "Departamento")
    @Getter
    @Setter
    @NoArgsConstructor
    public class DepartamentoEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id departamento")
        private long id;

        private String nombre;
}
