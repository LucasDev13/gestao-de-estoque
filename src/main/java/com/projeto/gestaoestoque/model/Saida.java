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
@Table(name = "tb_saidas")
public class Saida implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codSaida;
	private Cdc nomeCdc;
	private Estoque nomeEstoque;//para realizar transferencias para outros estoques
	private Produto produto;// vai poder obter todos os atributos
	private int quantSaidaProduto;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dataSaida;
	private LocalTime horaSaida;

	public Saida() {}

	public Long getCodSaida() {
		return codSaida;
	}

	public void setCodSaida(Long codSaida) {
		this.codSaida = codSaida;
	}

	public Cdc getNomeCdc() {
		return nomeCdc;
	}

	public void setNomeCdc(Cdc nomeCdc) {
		this.nomeCdc = nomeCdc;
	}
	
	public Estoque getNomeEstoque() {
		return nomeEstoque;
	}
	
	public void setNomeEstoque(Estoque nomeEstoque) {
		this.nomeEstoque = nomeEstoque;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantSaidaProduto() {
		return quantSaidaProduto;
	}

	public void setQuantSaidaProduto(int quantSaidaProduto) {
		this.quantSaidaProduto = quantSaidaProduto;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	public LocalTime getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(LocalTime horaSaida) {
		this.horaSaida = horaSaida;
	}

}
