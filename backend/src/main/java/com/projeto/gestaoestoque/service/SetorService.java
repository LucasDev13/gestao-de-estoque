package com.projeto.gestaoestoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.gestaoestoque.model.Setor;
import com.projeto.gestaoestoque.repository.SetorRepository;

@Service
public class SetorService {
	
	@Autowired
	private SetorRepository repoSetor;
	
	public Setor saveSetor(Setor setor) {
		return repoSetor.save(setor);
	}
	
	public List<Setor> findAll(){
		return repoSetor.findAll();
	}
	
	//buscarPorId
	//BuscarPorNome
	//Update
	//delete
	
}
