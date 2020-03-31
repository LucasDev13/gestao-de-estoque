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
@Table(name = "tb_cdc")
public class Cdc implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codCdc;
	private String nomeCdc;
	private String andar;
	private String bloco;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dataCadastro;
	private LocalTime horaCadastro;

	public Cdc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCodCdc() {
		return codCdc;
	}

	public void setCodCdc(Long codCdc) {
		this.codCdc = codCdc;
	}

	public String getNomeCdc() {
		return nomeCdc;
	}

	public void setNomeCdc(String nomeCdc) {
		this.nomeCdc = nomeCdc;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
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
