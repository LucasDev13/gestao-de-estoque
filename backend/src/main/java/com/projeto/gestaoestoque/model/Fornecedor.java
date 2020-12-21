package com.projeto.gestaoestoque.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long cnpjFornecedor;
	private String nomeFornecedor;
	private String email;
//	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
//	private LocalDate dataCadastro;
//	private LocalTime horaCadastro;

	// Associação de tem-varios de fornecedor com produto
	@OneToMany(mappedBy = "fornecedor")
	private List<Produto> produto = new ArrayList<>();

	// Associação tem um entre fornecedor e endereco
	@OneToOne (cascade = CascadeType.ALL)
	private Endereco endereco;

	@OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL)
	private List<Telefone> telefones;

	public Fornecedor() {
	}

//	public Fornecedor(int cnpjFornecedor, String nomeFornecedor, String email, Endereco endereco) {
//		this.cnpjFornecedor = cnpjFornecedor;
//		this.nomeFornecedor = nomeFornecedor;
//		this.email = email;
//		this.endereco = endereco;
//	}
	
	public Fornecedor(Long cnpjFornecedor, String nomeFornecedor, String email, Endereco endereco, List<Telefone> telefones) {
		this.cnpjFornecedor = cnpjFornecedor;
		this.nomeFornecedor = nomeFornecedor;
		this.email = email;
		this.endereco = endereco;
		this.telefones = telefones;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCnpjFornecedor() {
		return cnpjFornecedor;
	}

	public void setCnpjFornecedor(Long cnpjFornecedor) {
		this.cnpjFornecedor = cnpjFornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public LocalDate getDataCadastro() {
//		return dataCadastro;
//	}
//
//	public void setDataCadastro(LocalDate dataCadastro) {
//		this.dataCadastro = dataCadastro;
//	}
//
//	public LocalTime getHoraCadastro() {
//		return horaCadastro;
//	}
//
//	public void setHoraCadastro(LocalTime horaCadastro) {
//		this.horaCadastro = horaCadastro;
//	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void addProdutoLista(Produto produto) {
		this.produto.add(produto);
	}

	public void removeProdutoLista(Produto produto) {
		this.produto.remove(produto);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
