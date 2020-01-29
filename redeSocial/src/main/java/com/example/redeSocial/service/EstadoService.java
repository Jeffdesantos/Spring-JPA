package com.example.redeSocial.service;

import java.util.List;


import com.example.redeSocial.entity.Estado;


public interface EstadoService {

	Estado insertOrUpdate(Estado entity);
	
	void delete(int id);
	
	List<Estado> getAll();
	
	Estado getById(int id);
	
	List<Estado> getAllByEstado(String estado);
	
	Estado getByEstado(String estado);
	
	
}
