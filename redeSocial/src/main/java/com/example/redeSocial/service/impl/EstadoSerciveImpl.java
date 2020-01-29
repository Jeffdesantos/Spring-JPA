package com.example.redeSocial.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.redeSocial.entity.Estado;

import com.example.redeSocial.repository.EstadoRepository;
import com.example.redeSocial.service.EstadoService;

@Service
public class EstadoSerciveImpl implements EstadoService{

	@Autowired
	private EstadoRepository repository;
	
	@Override
	public Estado insertOrUpdate(Estado entity) {
		Estado estadoSalvo = this.repository.save(entity);
		return estadoSalvo;
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
		
	}

	@Override
	public List<Estado> getAll() {
		return (List<Estado>) this.repository.findAll();
	}

	@Override
	public Estado getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Estado> getAllByEstado(String estado) {
		return (List<Estado>)this.repository.findAllByEstado(estado);
	}

	@Override
	public Estado getByEstado(String estado) {
		return this.repository.findEstadoByEstado(estado);
	}

	
	

}
