package com.projeto.gestaoestoque.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.projeto.gestaoestoque.model.enums.TipoMovimentacao;

@Entity
@Table(name = "tb_movimentacao")
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "qtd_movimentacao")
	private int quantidadeMovimentcaoes;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDateTime dataHoraMovimentacao;

	@ManyToOne
	private Setor setor;

	private TipoMovimentacao tipoMovimentacao;

	public Movimentacao() {
	}

	public Movimentacao(Long id, Setor setor, TipoMovimentacao tipoMovimentacao) {
		this.id = id;
		this.dataHoraMovimentacao = LocalDateTime.now();
		this.setor = setor;
		this.tipoMovimentacao = tipoMovimentacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantidadeMovimentacoes() {
		return quantidadeMovimentcaoes;
	}

	public void setQuantidadeMovimentacoes(int quantidadeMovimentcaoes) {
		this.quantidadeMovimentcaoes = quantidadeMovimentcaoes;
	}

	public LocalDateTime getDataHoraMovimentacao() {
		return dataHoraMovimentacao;
	}

	public void setDataHoraMovimentacao(LocalDateTime dataHoraMovimentacao) {
		this.dataHoraMovimentacao = dataHoraMovimentacao;
	}

	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
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
