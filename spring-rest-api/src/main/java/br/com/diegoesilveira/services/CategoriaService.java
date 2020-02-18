package br.com.diegoesilveira.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.diegoesilveira.model.Categoria;
import br.com.diegoesilveira.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository repository;

	public List<Categoria> findAll(){
		return repository.findAll();
		
	}
}
