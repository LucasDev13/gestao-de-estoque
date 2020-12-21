package com.projeto.gestaoestoque.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_setor")
public class Setor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeSetor;
	private String andar;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dataCadastro;
	private LocalTime horaCadastro;
	
	@OneToMany(mappedBy = "setor")
	private List<Funcionario> funcionarios;
	
	@OneToMany(mappedBy = "setor")
	private List<Movimentacao> movimentacao;
	
	public Setor() {}

	public Setor(String nomeSetor, String andar) {
		this.nomeSetor = nomeSetor;
		this.andar = andar;
		this.dataCadastro = LocalDate.now();
		this.horaCadastro = LocalTime.now();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeSetor() {
		return nomeSetor;
	}

	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
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
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public List<Movimentacao> getMovimentacao() {
		return movimentacao;
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
		Setor other = (Setor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}