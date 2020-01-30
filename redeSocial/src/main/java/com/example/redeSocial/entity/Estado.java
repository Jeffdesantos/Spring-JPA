package com.example.redeSocial.entity;

import javax.persistence. *;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Estado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (length = 2)
	@NotEmpty
	@Size(max = 2, message = "Obrigatório preenchimento")
	private String estado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
