package com.vivachicken.model;

public class Categoria {
	private Integer id;
	private String imagen;
	private String nombre;
	
	public Categoria() {
	}

	public Categoria(Integer id, String imagen, String nombre) {
		this.id = id;
		this.imagen = imagen;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", imagen=" + imagen + ", nombre=" + nombre + "]";
	}
	
	
}
