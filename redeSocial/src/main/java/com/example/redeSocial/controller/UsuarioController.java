package com.example.redeSocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.redeSocial.entity.Usuario;
import com.example.redeSocial.service.UsuarioService;




@RestController
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	
@PostMapping("/usuario")
	public ResponseEntity<Usuario> post(@RequestBody Usuario entity){
	try {
		Usuario usuarioSalvo = this.service.insertOrUpdate(entity);
		return ResponseEntity.ok(usuarioSalvo);
	} catch (Exception e) {
		return ResponseEntity.badRequest().body(null);
	}

}
	
@PutMapping("/usuario")
public ResponseEntity<Usuario> put(@RequestBody Usuario entity){
	try {
		Usuario usuarioSalvo = this.service.insertOrUpdate(entity);
		return ResponseEntity.ok(usuarioSalvo);
	} catch (Exception e) {
		return ResponseEntity.badRequest().body(null);
	}
}

@DeleteMapping("/usuario/{id}")
public ResponseEntity<String> delete(@PathVariable int id){
	if(this.service.getById(id) == null) {
		return ResponseEntity.notFound().build();
	}
	
	try {
		this.service.delete(id);
		return ResponseEntity.ok("Removido com sucesso.");
	} catch (Exception err) {
		return ResponseEntity.badRequest().body(err.getMessage());
	}
}

@GetMapping("/usuario/{id}")
public ResponseEntity<Usuario> getById(@PathVariable int id){
	Usuario cliente = this.service.getById(id);
	
	if(cliente == null)
		return ResponseEntity.notFound().build();
	
	return ResponseEntity.ok(cliente);
}

@GetMapping("/usuario")
public ResponseEntity<List<Usuario>> getAll(){
	return ResponseEntity.ok(this.service.getAll());
}

@GetMapping("/usuario/nomes/{nome}")
public ResponseEntity<List<Usuario>> getAllByName(@PathVariable String nome){
	return ResponseEntity.ok(this.service.getAllByNome(nome));
}

@GetMapping("/usuario/nome/{nome}")
public ResponseEntity<Usuario> getByName(@PathVariable String nome){
	return ResponseEntity.ok(this.service.getByNome(nome));
}
}