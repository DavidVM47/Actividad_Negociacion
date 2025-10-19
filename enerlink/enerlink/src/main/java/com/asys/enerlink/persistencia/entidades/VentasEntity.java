package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Date;

    @Entity
    @Table(name = "Ventas")
    @Getter
    @Setter
    @NoArgsConstructor
    public class VentasEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id venta")
        private long id;

        private Date fecha;
        private Integer total;

}
