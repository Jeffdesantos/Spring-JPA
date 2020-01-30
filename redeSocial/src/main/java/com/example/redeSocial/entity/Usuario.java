package com.example.redeSocial.entity;

import javax.persistence. *;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (length = 100)
	@NotEmpty
	@Size(max = 100, message = "Obrigatório preenchimento")
	private String nome;
	
	@Column (length = 100)
	@NotEmpty
	@Size(max = 100, message = "Obrigatório preenchimento")
	private String email;
	
	@Column (length = 12)
	@NotEmpty
	@Size(max = 12, message = "Obrigatório preenchimento")
	private String senha;
	
	@ManyToOne
	private Estado id_estado;
	
	
	public Estado getId_estado() {
		return id_estado;
	}
	public void setId_estado(Estado id_estado) {
		this.id_estado = id_estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
