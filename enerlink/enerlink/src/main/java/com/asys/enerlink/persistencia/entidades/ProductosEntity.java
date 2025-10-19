package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


    @Entity
    @Table(name = "Productos")
    @Getter
    @Setter
    @NoArgsConstructor
    public class ProductosEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id producto")
        private long id;

        private String nombre;
        private Integer precio;
        private Integer cantidad;

    }
