package br.com.cotiinformatica.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.CategoriaResponseDto;
import br.com.cotiinformatica.entities.Categoria;
import br.com.cotiinformatica.repositories.CategoriaRepository;


@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

	@Autowired
	private ModelMapper modelMapper;

	@GetMapping
	public List<CategoriaResponseDto> getAll() throws Exception {
		
		//consultando todas as categorias do banco de dados
		CategoriaRepository categoriaRepository = new CategoriaRepository();		
		List<Categoria> categorias = categoriaRepository.findAll();
		
		List<CategoriaResponseDto> response = categorias
				.stream()
				.map(categoria -> modelMapper.map(categoria, CategoriaResponseDto.class))
				.collect(Collectors.toList());
		
		return response;
	}
}





