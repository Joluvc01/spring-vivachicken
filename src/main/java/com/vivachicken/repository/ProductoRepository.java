package com.vivachicken.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vivachicken.model.Categoria;
import com.vivachicken.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	public Optional<Producto> findByCategoria(Categoria categoria);
}
