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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_estoque")
public class Estoque implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codEstoque;
	private String nomeEstoque;
	private int quantidadeMinima;
	private int quantidadeMaxima;
	private int quantSaldoEstoque;
	
	@OneToMany(mappedBy = "estoque")
	private List<Produto> produtos = new ArrayList<>();

	public Estoque() {
	}
	
	public Estoque(String nomeEstoque, int quantidadeMinima, int quantidadeMaxima) {
		this.nomeEstoque = nomeEstoque;
		this.quantidadeMinima = quantidadeMinima;
		this.quantidadeMaxima = quantidadeMaxima;
	}
	
	public Estoque(Long codEstoque, String nomeEstoque, int quantidadeMinima, int quantidadeMaxima,
			int quantSaldoEstoque) {
		this.codEstoque = codEstoque;
		this.nomeEstoque = nomeEstoque;
		this.quantidadeMinima = quantidadeMinima;
		this.quantidadeMaxima = quantidadeMaxima;
		this.quantSaldoEstoque = quantSaldoEstoque;
	}

	public Long getCodEstoque() {
		return codEstoque;
	}

	public void setCodEstoque(Long codEstoque) {
		this.codEstoque = codEstoque;
	}
	
	public String getNomeEstoque() {
		return nomeEstoque;
	}
	
	public void setNomeEstoque(String nomeEstoque) {
		this.nomeEstoque = nomeEstoque;
	}

	public int getQuantidadeMinima() {
		return quantidadeMinima;
	}

	public void setQuantidadeMinima(int quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}

	public int getQuantidadeMaxima() {
		return quantidadeMaxima;
	}

	public void setQuantidadeMaxima(int quantidadeMaxima) {
		this.quantidadeMaxima = quantidadeMaxima;
	}

	public int getQuantSaldoEstoque() {
		return quantSaldoEstoque;
	}

	public void setQuantSaldoEstoque(int quantSaldoEstoque) {//Associação tem-varios de entrada com estoque.
		this.quantSaldoEstoque = quantSaldoEstoque;
	}
	
	public void addEstoque(Produto produto) {
		produtos.add(produto);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codEstoque == null) ? 0 : codEstoque.hashCode());
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
		Estoque other = (Estoque) obj;
		if (codEstoque == null) {
			if (other.codEstoque != null)
				return false;
		} else if (!codEstoque.equals(other.codEstoque))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Estoque [codEstoque=" + codEstoque + ", nomeEstoque=" + nomeEstoque + ", quantidadeMinima="
				+ quantidadeMinima + ", quantidadeMaxima=" + quantidadeMaxima + ", quantSaldoEstoque="
				+ quantSaldoEstoque + ", produtos=" + produtos + "]";
	}
	
	
	

}