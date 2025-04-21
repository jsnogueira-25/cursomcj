package com.juliana.cursomcj;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juliana.cursomcj.domain.Categoria;
import com.juliana.cursomcj.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcjApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcjApplication.class, args);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritório");
		
		//categoriaRepository.saveAllAndFlush(cat1,cat2);
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
