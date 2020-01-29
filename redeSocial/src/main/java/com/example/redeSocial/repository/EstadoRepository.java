package com.example.redeSocial.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.redeSocial.entity.Estado;

public interface EstadoRepository extends CrudRepository<Estado, Integer>{
	
	List<Estado> findAllByEstado(String estado);
	Estado findEstadoByEstado(String estado);
	
}
