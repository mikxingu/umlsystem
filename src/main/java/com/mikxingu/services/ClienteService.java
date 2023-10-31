package com.mikxingu.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikxingu.domain.Cliente;
import com.mikxingu.repositories.ClienteRepository;
import com.mikxingu.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = clienteRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto de Id: " + id + "não encontra! Tipo: " + Cliente.class.getName()));
	} 
}