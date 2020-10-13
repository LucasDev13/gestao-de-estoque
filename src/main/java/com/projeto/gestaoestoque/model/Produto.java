package com.projeto.gestaoestoque.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // faz ser autoincremento
	private Long id; // vai identificar o produto
	private String nomeProduto;
	private String descProduto;
	private LocalDate dataValidade;
	private int loteProduto;
	private String unidadeMedida;
	private double precoProduto;
	private int quantidadeProduto;// se refere a quantidade de produtos que estam entrando o saindo do estoque..
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDateTime dataCadastro;
	private LocalTime horaCadastro;

	// associaçoes
	@ManyToOne
	private Estoque estoque;// Quantidade do saldo no estoque
	@ManyToOne
	private Fornecedor fornecedor;
	
	@ManyToOne
	private Movimentacao movimentacao;

	public Produto() {
	}

	public Produto(String nomeProduto, int loteProduto, double precoProduto, int quantidadeProduto) {
		this.nomeProduto = nomeProduto;
		this.loteProduto = loteProduto;
		this.precoProduto = precoProduto;
		this.quantidadeProduto = quantidadeProduto;
		this.dataCadastro = LocalDateTime.now();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public int getLoteProduto() {
		return loteProduto;
	}

	public void setLoteProduto(int loteProduto) {
		this.loteProduto = loteProduto;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalTime getHoraCadastro() {
		return horaCadastro;
	}

	public void setHoraCadastro(LocalTime horaCadastro) {
		this.horaCadastro = horaCadastro;
	}

	public Estoque getEstoque() {
		return estoque;
	}
	
	public Movimentacao getMovimentacao() {
		return movimentacao;
	}
	
	public void setMovimentacao(Movimentacao movimentacao) {
		this.movimentacao = movimentacao;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	

}
