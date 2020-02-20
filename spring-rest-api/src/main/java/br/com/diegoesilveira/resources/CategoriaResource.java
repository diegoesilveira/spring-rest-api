package br.com.diegoesilveira.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.diegoesilveira.services.CategoriaService;

@RequestMapping(value = "/categorias")
@RestController
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;

	
}
