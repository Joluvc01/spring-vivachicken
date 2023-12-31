package com.vivachicken.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String imagen;
	private String nombre;
	
	@OneToMany(mappedBy = "categoria")
	private List<Producto> productos;
	
	public Categoria() {
	}


	public Categoria(Integer id, String imagen, String nombre, List<Producto> productos) {
		super();
		this.id = id;
		this.imagen = imagen;
		this.nombre = nombre;
		this.productos = productos;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Producto> getProductos() {
		return productos;
	}


	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}


	@Override
	public String toString() {
		return "Categoria [id=" + id + ", imagen=" + imagen + ", nombre=" + nombre + "]";
	}
	
	
}
