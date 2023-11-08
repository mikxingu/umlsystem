package com.mikxingu.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikxingu.domain.Pedido;
import com.mikxingu.repositories.PedidoRepository;
import com.mikxingu.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = pedidoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto de Id: " + id + "não encontra! Tipo: " + Pedido.class.getName()));
	} 
}