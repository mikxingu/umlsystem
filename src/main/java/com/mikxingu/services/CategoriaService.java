package com.mikxingu.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikxingu.domain.Categoria;
import com.mikxingu.repositories.CategoriaRepository;
import com.mikxingu.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto de Id: " + id + "não encontra! Tipo: " + Categoria.class.getName()));
	} 
}