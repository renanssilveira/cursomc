package com.renan.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renan.api.domain.Categoria;
import com.renan.api.repositories.CategoriaRepository;
import com.renan.api.services.exeptions.ObjectNotFoundException;



@Service
public class Categoriaservice {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id)   {
		
		Optional<Categoria> obj = repo.findById(id);
	return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName())); 
		
		
	} 
}
