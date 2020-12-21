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
	
	//Com a prática, você pode criar indicadores para fazer reposição e/ou a redução de produtos armazenados para evitar ficar com itens parados no armazém ou em falta.
	//é possível fazer a reposição de elementos de maneira antecipada.

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codEstoque;
	private String nomeEstoque;
	private int quantidadeMinima;
	private int quantidadeMaxima;
	private int quantSaldoEstoque;
	private int quantidade;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dataSaida;
	private LocalTime horaSaida;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dataEntrada;
	private LocalTime horaEntrada;
	
	//Associação tem-varios de entrada com estoque.
	@OneToMany(mappedBy = "estoque")
	private List<Produto> produtos = new ArrayList<>();

	public Estoque() {
	}
	
	public Estoque(String nomeEstoque, int quantidadeMinima, int quantidadeMaxima,
			LocalDate dataEntrada, LocalTime horaEntrada) {
		this.nomeEstoque = nomeEstoque;
		this.quantidadeMinima = quantidadeMinima;
		this.quantidadeMaxima = quantidadeMaxima;
		this.dataEntrada = LocalDate.now();
		this.horaEntrada = LocalTime.now();
	}
	
	public Estoque(Long codEstoque, String nomeEstoque, int quantidadeMinima, int quantidadeMaxima,
			int quantSaldoEstoque, int quantidade, LocalDate dataSaida, LocalTime horaSaida, LocalDate dataEntrada,
			LocalTime horaEntrada) {
		this.codEstoque = codEstoque;
		this.nomeEstoque = nomeEstoque;
		this.quantidadeMinima = quantidadeMinima;
		this.quantidadeMaxima = quantidadeMaxima;
		this.quantSaldoEstoque = quantSaldoEstoque;
		this.quantidade = quantidade;
		this.dataSaida = dataSaida;
		this.horaSaida = horaSaida;
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

	public void setQuantSaldoEstoque(int quantSaldoEstoque) {
		this.quantSaldoEstoque = quantSaldoEstoque;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
	
	public void addEstoque(Produto produto) {
		produtos.add(produto);
	}

}