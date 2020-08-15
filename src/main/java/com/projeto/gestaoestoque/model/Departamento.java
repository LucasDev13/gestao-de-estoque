package com.projeto.gestaoestoque.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_departamento")
public class Departamento {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer codDepartamento;
    private String nomeDepartamento;

    public Integer getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(Integer codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return Objects.equals(codDepartamento, that.codDepartamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codDepartamento);
    }
}