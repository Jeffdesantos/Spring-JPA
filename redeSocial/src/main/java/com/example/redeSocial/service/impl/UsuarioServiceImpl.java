package com.example.redeSocial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.redeSocial.entity.Usuario;
import com.example.redeSocial.repository.UsuarioRepository;
import com.example.redeSocial.service.UsuarioService;



@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	
	@Autowired
	private UsuarioRepository repository;

	@Override
	public Usuario insertOrUpdate(Usuario entity) {
		Usuario usuarioSalvo = this.repository.save(entity);
		return usuarioSalvo;
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
		
	}

	@Override
	public List<Usuario> getAll() {
		return (List<Usuario>) this.repository.findAll();
		
	}

	@Override
	public Usuario getById(int id) {
		return this.repository.findById(id).orElse(null);
		
	}

	@Override
	public List<Usuario> getAllByNome(String nome) {
		return (List<Usuario>)this.repository.findAllByNome(nome);
	}

	@Override
	public Usuario getByNome(String nome) {
		return this.repository.findUsuarioByNome(nome);
	}

	@Override
	public List<Usuario> getByNomeAndEmail(String nome, String email) {
		return (List<Usuario>)this.repository.findAllByNomeAndEmail(nome, email);
	}

}
