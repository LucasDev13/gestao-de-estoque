package com.projeto.gestaoestoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.gestaoestoque.model.Endereco;
import com.projeto.gestaoestoque.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository endRepository;
	
	@Transactional(readOnly = true)
	public List<Endereco> findAll(){
		List<Endereco> list = endRepository.findAll();
		return list;
	}
}
