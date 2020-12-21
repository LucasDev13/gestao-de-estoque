package com.projeto.gestaoestoque.controller;

import java.time.LocalDateTime;

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
import com.projeto.gestaoestoque.model.Movimentacao;
import com.projeto.gestaoestoque.model.enums.TipoMovimentacao;
import com.projeto.gestaoestoque.service.MovimentacaoService;

/**
 * Responsavel por gerenciar as movimentações de entrada/saida de produtos. 
 * @author lucasdev
 *
 */

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
	
//	@Autowired
//	private EstoqueService estService;
	
	@Autowired
	private MovimentacaoService movService;
	
	@PostMapping("/entrada")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Movimentacao> Entrada(@RequestBody Movimentacao mov) {
		
//		entrada 
		
//		saida
			
		
		//Optional<Estoque> estoque = estService.findById(1L);
//		System.out.println(estoque);
		Movimentacao movimentacao = new Movimentacao();
//		movimentacao.setEstoque(new Estoque("Geral"));
		LocalDateTime dateTime = LocalDateTime.now();
//		movimentacao.setDataMovimentacao(dateTime);
		System.out.println(movimentacao);
		
		//buscar o tipo de movimentação
		TipoMovimentacao tipoMovimentacao = TipoMovimentacao.ENTRADA;
//		movimentacao.setTipo(tipoMovimentacao);
//		movimentacao.addProdutosList(produto);
		
		//salvar a transação.
		
		return null;
	}
	
	@GetMapping("/saida")
	public void Saida() { 
		
	}
}
