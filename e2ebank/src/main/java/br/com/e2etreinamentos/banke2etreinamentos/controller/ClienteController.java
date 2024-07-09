package br.com.e2etreinamentos.banke2etreinamentos.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.e2etreinamentos.banke2etreinamentos.model.Cliente;
import br.com.e2etreinamentos.banke2etreinamentos.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

	 private static final Logger logger = LoggerFactory.getLogger(ClienteController.class);
	private final ClienteService clienteService;

	@Autowired
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping
	public ResponseEntity<List<Cliente>> getAllClientes() {
			
		List<Cliente> clientes = clienteService.getAllClientes();
		return new ResponseEntity<>(clientes, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
		Optional<Cliente> clienteOptional = clienteService.getClienteById(id);
		if (clienteOptional.isPresent()) {
			return new ResponseEntity<>(clienteOptional.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping
	public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente cliente) {
		Cliente clienteCadastrado = clienteService.cadastrarCliente(cliente);
		return new ResponseEntity<>(clienteCadastrado, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
		Cliente updatedCliente = clienteService.updateCliente(cliente);
		return new ResponseEntity<>(updatedCliente, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
		clienteService.deleteCliente(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
