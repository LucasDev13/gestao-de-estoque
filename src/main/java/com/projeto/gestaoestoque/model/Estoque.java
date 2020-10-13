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

	// Com a prática, você pode criar indicadores para fazer reposição e/ou a
	// redução de produtos armazenados para evitar ficar com itens parados no
	// armazém ou em falta.
	// é possível fazer a reposição de elementos de maneira antecipada.

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nomeEstoque;
	private int quantidadeMinima;// sempre inicia com zero.
	private int quantSaldoEstoque;// soma quantos produtos tem no estoque. vai precisar percorrer a lista de produtos.

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dataSaida;
	private LocalTime horaSaida;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dataEntrada;
	private LocalTime horaEntrada;

	// Associação tem-varios de entrada com estoque.
	//private List<Movimentacao> movimentacoes = new ArrayList<>();
	@OneToMany(mappedBy = "estoque")
	private List<Produto> produtos = new ArrayList<>();

	public Estoque() {
	}

	public Estoque(Long codEstoque, String nomeEstoque) {
		this.quantidadeMinima = 0;
		this.nomeEstoque = nomeEstoque;
		this.dataEntrada = LocalDate.now();
		this.horaEntrada = LocalTime.now();
	}

	public Estoque(Long id, String nomeEstoque, int quantSaldoEstoque, LocalDate dataSaida, LocalTime horaSaida,
			LocalDate dataEntrada, LocalTime horaEntrada) {
		this.id = id;
		this.nomeEstoque = nomeEstoque;
		this.quantidadeMinima = 0;
		this.quantSaldoEstoque = quantSaldoEstoque;
		this.dataSaida = dataSaida;
		this.horaSaida = horaSaida;
		this.dataEntrada = dataEntrada;
		this.horaEntrada = horaEntrada;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getQuantSaldoEstoque() {
		return quantSaldoEstoque;
	}

	public void setQuantSaldoEstoque(int quantSaldoEstoque) {
		this.quantSaldoEstoque = quantSaldoEstoque;
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

//	public List<Movimentacao> getMovimentacoes() {
//		return movimentacoes;
//	}
//	
//	public void addEstoqueMovimentacao(Movimentacao movimentacoes) {
//		this.movimentacoes.add(movimentacoes);
//	}

	// adiciona os produtos em uma lsita
	public void addEstoque(Produto produto) {
		this.produtos.add(produto);
	}

	public void removeEstoque(Produto p) {
		this.produtos.remove(p);

		// adicionar a remoção deste produto da lista de saidas do estoque
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
		Estoque other = (Estoque) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Estoque [id=" + id + ", nomeEstoque=" + nomeEstoque + ", quantidadeMinima=" + quantidadeMinima
				+ ", quantSaldoEstoque=" + quantSaldoEstoque + ", dataSaida=" + dataSaida + ", horaSaida=" + horaSaida
				+ ", dataEntrada=" + dataEntrada + ", horaEntrada=" + horaEntrada + "]";
	}

}
