package com.vivachicken.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivachicken.model.Categoria;
import com.vivachicken.repository.CategoriaRepository;
@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public Categoria save(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	@Override
	public Optional<Categoria> findById(Integer id) {
		return categoriaRepository.findById(id);
	}

	@Override
	public void update(Categoria categoria) {
		categoriaRepository.save(categoria);
	}

	@Override
	public void delete(Integer id) {
		categoriaRepository.deleteById(id);
	}

}
