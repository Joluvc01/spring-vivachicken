package com.vivachicken.model;

public class Usuario {
	private Integer id;
	private String username;
	private String password;
	private Boolean estado;
	private Integer id_cargo;
	

	public Usuario() {
	}
	
	public Usuario(Integer id, String username, String password, Boolean estado, Integer id_cargo) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.estado = estado;
		this.id_cargo = id_cargo;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public Integer getIdCargo() {
		return id_cargo;
	}
	public void setIdCargo(Integer idCargo) {
		this.id_cargo = idCargo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", password=" + password + ", estado=" + estado
				+ ", id_cargo=" + id_cargo + "]";
	}
	
	
}
