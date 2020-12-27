package com.projeto.gestaoestoque.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nomeProduto;
	private String descProduto;
	private LocalDate dataValidade;
	private int loteProduto;
	private String unidadeMedida;
	private double custoUnitario;
	private double precoUnitario;
	private double totalCompra;
	private int quantidadeProduto;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dataCadastro;
	private LocalTime horaCadastro;

	@ManyToOne
	private Estoque estoque;
	@ManyToOne
	private Fornecedor fornecedor;

	@ManyToOne
	private Movimentacao movimentacao;

	public Produto() {
	}

	public Produto(String nomeProduto, int loteProduto, double custoUnitario, int quantidadeProduto) {
		this.nomeProduto = nomeProduto;
		this.loteProduto = loteProduto;
		this.custoUnitario = custoUnitario;
		this.quantidadeProduto = quantidadeProduto;
		this.dataCadastro = LocalDate.now();
		this.horaCadastro = LocalTime.now();
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

	public double getcustoUnitario() {
		return custoUnitario;
	}

	public void setcustoUnitario(double custoUnitario) {
		this.custoUnitario = custoUnitario;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public double getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
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
	public String toString() {
		return "Produto [id=" + id + ", nomeProduto=" + nomeProduto + ", descProduto=" + descProduto + ", dataValidade="
				+ dataValidade + ", loteProduto=" + loteProduto + ", unidadeMedida=" + unidadeMedida
				+ ", custoUnitario=" + custoUnitario + ", precoUnitario=" + precoUnitario + ", totalCompra="
				+ totalCompra + ", quantidadeProduto=" + quantidadeProduto + ", dataCadastro=" + dataCadastro
				+ ", horaCadastro=" + horaCadastro + ", estoque=" + estoque + ", fornecedor=" + fornecedor
				+ ", movimentacao=" + movimentacao + "]";
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
