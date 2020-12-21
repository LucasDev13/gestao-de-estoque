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

import com.projeto.gestaoestoque.model.Funcionario;
import com.projeto.gestaoestoque.service.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcService;
	
	@PostMapping("/salvar")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Funcionario> salvar(@RequestBody Funcionario funcionario){
		Funcionario func = funcService.saveFuncionario(funcionario);
		return ResponseEntity.ok().body(func);
	}
	
	@GetMapping("/buscarTodos")
	public List<Funcionario> buscarTodos(){
		return funcService.findAll();
	}
	
	//buscarPorId
		//BuscarPorNome
		//Update
		//delete
}
