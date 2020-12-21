package com.projeto.gestaoestoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.gestaoestoque.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
