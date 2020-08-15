package com.projeto.gestaoestoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.gestaoestoque.model.Produto;
//é um componente
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
