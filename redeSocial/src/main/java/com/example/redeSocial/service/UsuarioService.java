package com.example.redeSocial.service;

import java.util.List;

import com.example.redeSocial.entity.Usuario;

public interface UsuarioService {

Usuario insertOrUpdate(Usuario entity);
	
	void delete(int id);
	
	List<Usuario> getAll();
	
	Usuario getById(int id);
	
	List<Usuario> getAllByNome(String nome);
	
	Usuario getByNome(String nome);
	
	List<Usuario> getByNomeAndEmail(String nome, String email);
}
