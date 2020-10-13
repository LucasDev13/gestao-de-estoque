package com.projeto.gestaoestoque.model;

import java.time.LocalDateTime;
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
@Table(name = "tb_movimentacao")
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String tipoMovimentacao;// Pode ser um enum
	private int quantidadeMovimentcaoes;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDateTime dataMovimentacao;

	// Associações
	@OneToMany(mappedBy = "movimentacao")
	private List<Produto> produtos = new ArrayList<>();

	public Movimentacao() {
	}

	public Movimentacao(Long id, String tipoMovimentacao) {
		this.id = id;
		this.tipoMovimentacao = tipoMovimentacao;
		quantidadeMovimentcaoes++;// acrescenta o atributo a cada instancia de objetps do tipo Movimentacao.
		this.dataMovimentacao = LocalDateTime.now();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(String tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

	public int getQuantidadeMovimentacoes() {
		return quantidadeMovimentcaoes;
	}

	public void setQuantidadeMovimentacoes(int quantidadeMovimentcaoes) {
		this.quantidadeMovimentcaoes = quantidadeMovimentcaoes;
	}

	public LocalDateTime getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(LocalDateTime dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public int totalMovimentcaoes() {
		// precisa ser um contador
		return quantidadeMovimentcaoes++;// vai somar quantas movimentacoes teve.
	}

	public void addProdutosList(Produto produto) {
		produtos.add(produto);// adiciona os produtos na lista do objeto que ira ser passado para o estoque.
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
		Movimentacao other = (Movimentacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
