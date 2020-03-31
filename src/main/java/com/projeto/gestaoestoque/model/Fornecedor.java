package com.projeto.gestaoestoque.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

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

	public Fornecedor() {
		super();
		// TODO Auto-generated constructor stub
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

}
