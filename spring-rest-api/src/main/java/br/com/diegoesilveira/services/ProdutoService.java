package br.com.diegoesilveira.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.diegoesilveira.model.Produto;
import br.com.diegoesilveira.repository.ProdutoRepository;
import br.com.diegoesilveira.services.exceptions.ObjectNotFoundException;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;

	public List<Produto> findAll(){
		return repository.findAll();
	}
	public Produto find(Integer codigo) {
		Optional<Produto> obj = repository.findById(codigo);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Usuario não encontrado! Id: " + codigo + ", Tipo: " + Produto.class.getName()));
	}
	
	public Produto insert(Produto codigo) {
		return repository.save(codigo);
	}
	
	public Produto update(Produto obj) {
		find(obj.getCodigo());
		return repository.save(obj);
	}
	
	public void delete(Integer codigo) {
		find(codigo);
		repository.deleteById(codigo);
	}
}
