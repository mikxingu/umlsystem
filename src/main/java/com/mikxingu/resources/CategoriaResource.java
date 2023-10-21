package com.mikxingu.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mikxingu.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@GetMapping
	public List<Categoria> listCategories() {
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> categoriasList = new ArrayList<>();
		
		categoriasList.add(cat1);
		categoriasList.add(cat2);
		return categoriasList;
	}
}
