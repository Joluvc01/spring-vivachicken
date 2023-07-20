package com.vivachicken.service;

import java.util.Optional;

import com.vivachicken.model.Categoria;

public interface CategoriaService {
	public Categoria save(Categoria categoria);
	public Optional<Categoria> findById(Integer id);
	public void update(Categoria categoria);
	public void delete(Integer id);
	
}
