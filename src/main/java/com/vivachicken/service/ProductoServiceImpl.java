package com.vivachicken.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivachicken.model.Categoria;
import com.vivachicken.model.Producto;
import com.vivachicken.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;
	

	@Override
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Optional<Producto> findById(Integer id) {
		return productoRepository.findById(id);
	}
	
	@Override
	public Optional<Producto> findByCategoria(Categoria categoria) {
		return productoRepository.findByCategoria(categoria);
	}


	@Override
	public void update(Producto producto) {
		productoRepository.save(producto);
	}

	@Override
	public void delete(Integer id) {
		productoRepository.deleteById(id);
	}

	@Override
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}

}
