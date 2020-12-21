package com.projeto.gestaoestoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.gestaoestoque.model.Funcionario;
import com.projeto.gestaoestoque.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository repoFuncionario;
	
	public Funcionario saveFuncionario(Funcionario funcionario) {
		return repoFuncionario.save(funcionario);
	}
	
	public List<Funcionario> findAll(){
		List<Funcionario> list = repoFuncionario.findAll();
		return list;
	}
	
	//buscarPorId
		//BuscarPorNome
		//Update
		//delete

}
