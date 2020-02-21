package br.com.diegoesilveira.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.diegoesilveira.model.Categoria;
import br.com.diegoesilveira.services.CategoriaService;


@RequestMapping(value = "/categorias")
@RestController
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Categoria usuario) {
		usuario = service.insert(usuario);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{codigoUsuario}")
				.buildAndExpand(usuario.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	

	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
	public ResponseEntity<Categoria> find(@PathVariable Integer codigo) {
		Categoria obj = service.find(codigo);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	
}
