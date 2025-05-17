package com.example.EcoMarketProducto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table (name = "producto")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Producto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    @Column(nullable = false)
    private String nombreProducto;

    @Column(nullable = false)
    private String detalleProducto;

    @Column(nullable = false)
    private BigDecimal precioProducto;

    @Column(nullable = false)
    private Integer stock;

}
