package com.vivachicken.model;

import java.util.Date;

public class Orden {
	private Integer id;
	private Integer id_detalle;
	private Integer id_cliente;
	private Date fecha;
	private double subtotal;
	private double igv;
	private double totalFinal;
	
	private double total;
	
	public Orden() {
	}

	public Orden(Integer id, Integer id_detalle, Integer id_cliente, Date fecha, double subtotal, double igv,
			double totalFinal, double total) {

		this.id = id;
		this.id_detalle = id_detalle;
		this.id_cliente = id_cliente;
		this.fecha = fecha;
		this.subtotal = subtotal;
		this.igv = igv;
		this.totalFinal = totalFinal;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_detalle() {
		return id_detalle;
	}

	public void setId_detalle(Integer id_detalle) {
		this.id_detalle = id_detalle;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getIgv() {
		return igv;
	}

	public void setIgv(double igv) {
		this.igv = igv;
	}

	public double getTotalFinal() {
		return totalFinal;
	}

	public void setTotalFinal(double totalFinal) {
		this.totalFinal = totalFinal;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", id_detalle=" + id_detalle + ", id_cliente=" + id_cliente + ", fecha=" + fecha
				+ ", subtotal=" + subtotal + ", igv=" + igv + ", totalFinal=" + totalFinal + ", total=" + total + "]";
	}
	
	

}

