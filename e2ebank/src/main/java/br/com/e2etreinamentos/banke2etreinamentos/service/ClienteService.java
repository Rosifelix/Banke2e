package br.com.e2etreinamentos.banke2etreinamentos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.e2etreinamentos.banke2etreinamentos.model.Cliente;
import br.com.e2etreinamentos.banke2etreinamentos.repository.ClienteRepository;

@Service
public class ClienteService {

	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	// Method to save a new customer
	public Cliente cadastrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

	// Method to retrieve all customers
	public List<Cliente> getAllClientes() {
		return clienteRepository.findAll();
	}

	// Method to retrieve a customer by ID
	public Optional<Cliente> getClienteById(Long id) {
		return clienteRepository.findById(id);
	}

	// Method to update a customer
	public Cliente updateCliente(Cliente customer) {
		return clienteRepository.save(customer);
	}

	// Method to delete a customer by ID
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}
}
