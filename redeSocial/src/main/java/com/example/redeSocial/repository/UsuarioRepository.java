package com.example.redeSocial.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.redeSocial.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

	List<Usuario> findAllByNome(String nome);
	Usuario findUsuarioByNome(String nome);
	List<Usuario> findAllByNomeAndEmail(String nome, String email);
}
