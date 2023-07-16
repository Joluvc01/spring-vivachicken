package com.vivachicken.model;

public class Producto {
	private Integer id;
	private Integer id_categoria;
	private String imagen;
	private String nombre;
	private double precio;
	private int stock;
	private Boolean estado;
	
	
	public Producto() {
	}

	public Producto(Integer id, Integer id_categoria, String imagen, String nombre, Double precio, Integer stock,
			Boolean estado) {
		this.id = id;
		this.id_categoria = id_categoria;
		this.imagen = imagen;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.estado = estado;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdCategoria() {
		return id_categoria;
	}

	public void setIdCategoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
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

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", id_categoria=" + id_categoria + ", imagen=" + imagen + ", nombre=" + nombre
				+ ", precio=" + precio + ", stock=" + stock + ", estado=" + estado + "]";
	}
	
	
	
	
}
