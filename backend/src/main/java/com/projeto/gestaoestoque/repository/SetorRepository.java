package com.projeto.gestaoestoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.gestaoestoque.model.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Long>{

}
