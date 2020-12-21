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

import com.projeto.gestaoestoque.model.Estoque;
import com.projeto.gestaoestoque.service.EstoqueService;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {
	
	@Autowired
	private EstoqueService estoqueService;
	
	@GetMapping("/status")
	public String obtemStatus() {
		String ativo = "ativo";
		return ativo;
	}
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	private ResponseEntity<Estoque> salvar(@RequestBody Estoque estoque){
		return ResponseEntity.ok().body(estoqueService.saveEstoque(estoque));
	}
	
	@GetMapping("/buscarTodos")
	public List<Estoque> findAll(){
		List<Estoque> list = estoqueService.findAll();
		return list;
	}
	
	//buscarPorId
		//BuscarPorNome
		//Update
		//delete
}
