package com.vivachicken.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String password;
	private Boolean estado;
	
	@ManyToOne
	private Cargo cargo;
	

	public Usuario() {
	}
	
	
	public Usuario(Integer id, String username, String password, Boolean estado, Cargo cargo) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.estado = estado;
		this.cargo = cargo;
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

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}



	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", password=" + password + ", estado=" + estado
				+ ", cargo=" + cargo + "]";
	}


	
	
}
