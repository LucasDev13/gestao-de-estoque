package com.projeto.gestaoestoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.gestaoestoque.model.Fornecedor;
import com.projeto.gestaoestoque.service.FornecedorService;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
	
	@Autowired
	private FornecedorService fornService;
	
	@PostMapping("/salvar")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Fornecedor>  cadastrar(@RequestBody Fornecedor fornecedor) {
		Fornecedor forn = fornService.saveFornecedor(fornecedor);
		return ResponseEntity.ok().body(forn);
	}

	
	//update
	
	//delete 
		
	//findById
		
	//findAll
}
