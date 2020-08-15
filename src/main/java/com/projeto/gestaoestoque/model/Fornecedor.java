package com.projeto.gestaoestoque.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codFornecedor;
	private int cnpjFornecedor;
	private String nomeRazaoSocialFornecedor;
	private String nomeFantasiaFornecedor;
	private String ramoAtuacao;
	private int telefone;
	private String email;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dataCadastro;
	private LocalTime horaCadastro;

	// Associação de tem-varios de fornecedor com produto
	// avaliar se vai ser instaciado o Arraylist<>()
	private List<Produto> produto = new ArrayList<>();

	// Associação tem um entre fornecedor e endereco
	private Endereco endereco;

	public Fornecedor() {
	}

	public Fornecedor(String nomeRazaoSocialFornecedor, Endereco endereco) {
		this.nomeRazaoSocialFornecedor = nomeRazaoSocialFornecedor;
		this.endereco = endereco;
	}

	public Long getCodFornecedor() {
		return codFornecedor;
	}

	public void setCodFornecedor(Long codFornecedor) {
		this.codFornecedor = codFornecedor;
	}

	public int getCnpjFornecedor() {
		return cnpjFornecedor;
	}

	public void setCnpjFornecedor(int cnpjFornecedor) {
		this.cnpjFornecedor = cnpjFornecedor;
	}

	public String getNomeRazaoSocialFornecedor() {
		return nomeRazaoSocialFornecedor;
	}

	public void setNomeRazaoSocialFornecedor(String nomeRazaoSocialFornecedor) {
		this.nomeRazaoSocialFornecedor = nomeRazaoSocialFornecedor;
	}

	public String getNomeFantasiaFornecedor() {
		return nomeFantasiaFornecedor;
	}

	public void setNomeFantasiaFornecedor(String nomeFantasiaFornecedor) {
		this.nomeFantasiaFornecedor = nomeFantasiaFornecedor;
	}

	public String getRamoAtuacao() {
		return ramoAtuacao;
	}

	public void setRamoAtuacao(String ramoAtuacao) {
		this.ramoAtuacao = ramoAtuacao;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalTime getHoraCadastro() {
		return horaCadastro;
	}

	public void setHoraCadastro(LocalTime horaCadastro) {
		this.horaCadastro = horaCadastro;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void addProdutoLista(Produto produto) {
		this.produto.add(produto);	
	}
	
	public void removeProdutoLista(Produto produto) {
		this.produto.remove(produto);
	}
	
//	public List<Produto> pesquisaProduto(){
//		
//	}

	@Override
	public String toString() {
		return "Fornecedor: " + nomeRazaoSocialFornecedor + ", " + endereco + "]";
	}

}
