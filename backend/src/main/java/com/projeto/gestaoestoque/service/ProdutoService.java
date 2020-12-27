package com.projeto.gestaoestoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.gestaoestoque.model.Produto;
import com.projeto.gestaoestoque.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository prodRepository;
	
	@Transactional(readOnly = true)
	public List<Produto> findAll(){
		List<Produto> list = prodRepository.findAll();
		return list;
	}
	
	public Produto saveProduct(Produto product) {
		return prodRepository.save(product);
	}
}
