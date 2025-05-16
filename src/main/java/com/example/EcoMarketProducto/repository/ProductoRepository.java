package com.example.EcoMarketProducto.repository;

import com.example.EcoMarketProducto.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    // Encuentra productos por nombre
    List<Producto> findByNombreProducto(String nombreProducto);

    // Encuentra producto por ID
    Optional<Producto> findByIdProducto(Integer idProducto);


}


