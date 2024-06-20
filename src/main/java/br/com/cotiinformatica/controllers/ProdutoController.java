package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/produtos")
public class ProdutoController {

	@PostMapping
	public void post() {
		//TODO
	}
	
	@PutMapping
	public void put() {
		//TODO
	}
	
	@DeleteMapping
	public void detele() {
		//TODO
	}
	
	@GetMapping
	public void get() {
		//TODO
	}
}
