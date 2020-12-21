package com.example.projeto.gestaoestoque;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.projeto.gestaoestoque.model.Endereco;
import com.projeto.gestaoestoque.model.Estoque;
import com.projeto.gestaoestoque.model.Fornecedor;
import com.projeto.gestaoestoque.model.Movimentacao;
import com.projeto.gestaoestoque.model.Produto;
import com.projeto.gestaoestoque.service.FornecedorService;

@SpringBootTest
class GestaoEstoqueApplicationTests {
	
	@Autowired
	private FornecedorService fornService;
	
	@Test
	public void initFornecedor() {
//		Fornecedor forn = new Fornecedor(587458, "Atalaia Informatica", "atalaia@gmail.com", new Endereco("rua juvelino"));
		
//		fornService.saveFornecedor(forn);
	}


//	@Test
//	public void initEstoque() {
//		Estoque estoque = new Estoque(1L, "manutencao");
//
//		Produto produto = new Produto("teclado", 1254, 12.50, 5);
//		Produto produto1 = new Produto("mouse", 1232, 20.50, 5);
//
//		Fornecedor fornecedor = new Fornecedor();
//		fornecedor.addProdutoLista(produto);
//		fornecedor.addProdutoLista(produto1);

//		Movimentacao mov1 = new Movimentacao(1L, "entrada");
//		mov1.addProdutosList(produto);
//		mov1.addProdutosList(produto1);
//
//		Movimentacao mov2 = new Movimentacao(2L, "entrada");
//		mov2.addProdutosList(produto);
//
//		Movimentacao mov3 = new Movimentacao(3L, "entrada");
//		mov3.addProdutosList(produto);
//
//		Movimentacao mov4 = new Movimentacao(4L, "saida");
//		mov4.addProdutosList(produto);

		// adiciona a movimentação ao estoque /  
//		Estoque est = new Estoque();
//		est.addEstoqueMovimentacao(mov1);
//		est.addEstoqueMovimentacao(mov2);
//		est.addEstoqueMovimentacao(mov3);
//		est.addEstoqueMovimentacao(mov4);
		
		
//		est.addEstoque(produto);
		
//		System.out.println("estoque: " + estoque);
//		System.out.println("********************");
//		System.out.println("produto:" +produto);
//		System.out.println("********************");
//		System.out.println("Mov1: " + mov1);
//		System.out.println("********************");
//		System.out.println("mov2: "+mov2);
//		System.out.println("********************");
//		System.out.println("mov3: "+mov3);
//		System.out.println("********************");
//		System.out.println("mov4: "+mov4);

	}

