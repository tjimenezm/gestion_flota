package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Cliente;


@RestController
public class ClienteController {


	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping("/clientes")
	public List<Cliente> query() {
		return clienteRepository.getAllClientes();
	}
	@GetMapping("/clientes/{id}")
	public List<Cliente> getClienteById(@PathVariable Long id) {
		return clienteRepository.getClienteById(id);
	}
}
