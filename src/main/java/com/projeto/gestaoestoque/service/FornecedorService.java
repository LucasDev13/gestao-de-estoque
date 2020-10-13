package com.projeto.gestaoestoque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.gestaoestoque.model.Fornecedor;
import com.projeto.gestaoestoque.repository.FornecedorRepository;

@Service
public class FornecedorService {
	
	@Autowired
	private FornecedorRepository fornRepository;
	
	public Fornecedor saveFornecedor(Fornecedor fornecedor) {
		Fornecedor forn = fornRepository.save(fornecedor);
		return forn;
	}
	
	//update
	
	//delete 
	
	//findById
	
	//findAll
}
