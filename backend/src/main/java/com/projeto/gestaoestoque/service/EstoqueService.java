package com.projeto.gestaoestoque.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.gestaoestoque.model.Estoque;
import com.projeto.gestaoestoque.repository.EstoqueRepository;

@Service
public class EstoqueService {
	
	@Autowired
	private EstoqueRepository estoqueRepository;
	
	public Estoque saveEstoque(Estoque estoque) {
		return estoqueRepository.save(estoque);
	}
	
	public List<Estoque> findAll(){
		return estoqueRepository.findAll();
	}
	
	public Optional<Estoque> findById(Long id) {
		Optional<Estoque> est = estoqueRepository.findById(id);
		return est;
	}
	
		//BuscarPorNome
		//Update
		//delete
}
