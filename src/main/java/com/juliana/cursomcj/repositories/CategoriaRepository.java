package com.juliana.cursomcj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juliana.cursomcj.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	
    // Aqui você pode adicionar métodos customizados se precisar, como:
    // List<Categoria> findByNomeContaining(String nome);
}