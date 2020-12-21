package com.projeto.gestaoestoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.gestaoestoque.model.Setor;
import com.projeto.gestaoestoque.service.SetorService;

@RestController
@RequestMapping("/setor")
public class SetorController {
	
	@Autowired
	private SetorService setorService;
	
	@PostMapping("/salvar")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Setor> cadastrar(@RequestBody Setor setor){
		return ResponseEntity.ok().body(setorService.saveSetor(setor));
	}
	
	@GetMapping("/buscarTodos")
	public List<Setor> findAll(){
		List<Setor> list = setorService.findAll();
		return list;
	}
	
	//buscarPorId
		//BuscarPorNome
		//Update
		//delete

}
