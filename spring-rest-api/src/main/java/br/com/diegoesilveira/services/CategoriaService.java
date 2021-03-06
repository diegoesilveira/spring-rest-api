package br.com.diegoesilveira.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.diegoesilveira.model.Categoria;
import br.com.diegoesilveira.repository.CategoriaRepository;

import br.com.diegoesilveira.services.exception.ObjectNotFoundException;


@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository repository;

	public List<Categoria> findAll() {

		return repository.findAll();

	}
	
	public Categoria find(Integer codigo) {
		Optional<Categoria> obj = repository.findById(codigo);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + codigo + ", Tipo: " + Categoria.class.getName()));
	}
	
	public Categoria insert(Categoria codigo) {
		return repository.save(codigo);
	}
	
	
}
