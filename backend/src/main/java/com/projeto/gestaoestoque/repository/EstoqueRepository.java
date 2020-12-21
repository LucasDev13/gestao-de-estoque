package com.projeto.gestaoestoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.gestaoestoque.model.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long>{

}
