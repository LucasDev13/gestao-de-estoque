package com.projeto.gestaoestoque.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codFuncionario;
	private String nomeCompleto;
	private String email;
	private String telefone;
	
	//mapeamento da classe funcionario (N) com departamento(1)
    @ManyToOne
    private Departamento departamento;
    
    public Funcionario() {
    	
    }
    
    public Funcionario(String nomeCompleto) {
    	this.nomeCompleto = nomeCompleto;
    }

	public Long getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(Long codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {

        this.departamento = departamento;
    }

	
}
