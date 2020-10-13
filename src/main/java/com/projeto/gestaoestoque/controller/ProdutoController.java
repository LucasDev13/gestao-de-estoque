package com.projeto.gestaoestoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.gestaoestoque.model.Produto;
import com.projeto.gestaoestoque.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService prodService;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll(){
		List<Produto> list = prodService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	@PostMapping("/salvar")
	public void cadastrar(@RequestBody Produto produto) {
		prodService.saveProduto(produto);
	}
	
}
