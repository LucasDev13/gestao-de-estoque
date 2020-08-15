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
@Table(name = "tb_entrada")
public class Entrada implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codEntrada;
	private int quantidadeEntradaEstoque;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dataEntrada;
	private LocalTime horaEntrada;
	
	private List<Produto> produtos = new ArrayList<>();
	private Estoque estoque; 
	
	public Entrada() {}
	
	public Entrada(Long codEntrada, int quantidadeEntradaEstoque, LocalDate dataEntrada, LocalTime horaEntrada) {
		this.codEntrada = codEntrada;
		this.quantidadeEntradaEstoque = quantidadeEntradaEstoque;
		this.dataEntrada = dataEntrada;
		this.horaEntrada = horaEntrada;
	}
	
	public Long getCodEntrada() {
		return codEntrada;
	}
	
	public void setCodEntrada(Long codEntrada) {
		this.codEntrada = codEntrada;
	}

	public int getQuantidadeEntradaEstoque() {
		return quantidadeEntradaEstoque;
	}

	public void setQuantidadeEntradaEstoque(int quantidadeEntradaEstoque) {
		this.quantidadeEntradaEstoque = quantidadeEntradaEstoque;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void addProdutoEntrada(Produto produto) {
		produtos.add(produto);//adiciona
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codEntrada == null) ? 0 : codEntrada.hashCode());
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
		Entrada other = (Entrada) obj;
		if (codEntrada == null) {
			if (other.codEntrada != null)
				return false;
		} else if (!codEntrada.equals(other.codEntrada))
			return false;
		return true;
	}
	
	
	
	
}
