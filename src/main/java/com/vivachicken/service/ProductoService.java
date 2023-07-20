package com.vivachicken.service;

import java.util.List;
import java.util.Optional;

import com.vivachicken.model.Categoria;
import com.vivachicken.model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> findById(Integer id);
	public Optional<Producto> findByCategoria(Categoria categoria);
	public void update(Producto producto);
	public void delete(Integer id);
	public List<Producto> findAll();
}
