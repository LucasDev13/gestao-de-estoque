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
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProdutoService productService;
	
	@GetMapping("/status")
	public String obtemStatus() {
		String ativo = "ativo";
		return ativo;
	}
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll(){
		List<Produto> list = productService.findAll();
		System.out.println(list);
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping("/save")
	public void saveEntrada(@RequestBody Produto product) {
		System.out.println(product);
		productService.saveProduct(product);
	}
}
