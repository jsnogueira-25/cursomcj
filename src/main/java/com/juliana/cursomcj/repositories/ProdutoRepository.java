package com.juliana.cursomcj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juliana.cursomcj.domain.Categoria;
import com.juliana.cursomcj.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	
    // Aqui você pode adicionar métodos customizados se precisar, como:
    // List<Produto> findByNomeContaining(String nome);
}