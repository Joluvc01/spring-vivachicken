package com.vivachicken.model;

public class DetalleOrden {
	private Integer id;
	private Integer id_producto;
	private double cantidad;
	private double total;
	
	public DetalleOrden() {
	}

	public DetalleOrden(Integer id, int id_producto, double cantidad, double total) {
		this.id = id;
		this.id_producto = id_producto;
		this.cantidad = cantidad;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "DetalleOrden [id=" + id + ", id_producto=" + id_producto + ", cantidad=" + cantidad + ", total=" + total
				+ "]";
	}
	

}