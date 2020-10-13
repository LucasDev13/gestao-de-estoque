package com.projeto.gestaoestoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.gestaoestoque.model.Endereco;
import com.projeto.gestaoestoque.service.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
	
	@Autowired
	private EnderecoService endService;
	
	@GetMapping
	public ResponseEntity<List<Endereco>> findAll(){
		List<Endereco> list = endService.findAll();
		return ResponseEntity.ok().body(list);
	}
}
