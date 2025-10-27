package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Clientes")
@Getter
@Setter
@NoArgsConstructor
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id cliente")
    private long id;

    private String nombre;
    private String direccion;
    private Integer telefono;
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private CiudadEntity ciudad;
}
