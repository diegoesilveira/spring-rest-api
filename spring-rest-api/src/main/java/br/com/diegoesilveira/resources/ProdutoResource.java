package br.com.diegoesilveira.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.diegoesilveira.services.ProdutoService;

@RequestMapping(value = "/produtos")
@RestController
public class ProdutoResource {

	@Autowired
	private ProdutoService service;
	
	
}
