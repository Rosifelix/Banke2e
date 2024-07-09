package br.com.e2etreinamentos.banke2etreinamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.e2etreinamentos.banke2etreinamentos.model.ContaDeCliente;
import br.com.e2etreinamentos.banke2etreinamentos.repository.ContaDeClienteRepository;

@Service
public class ContaDeClienteService {

	private final ContaDeClienteRepository customerOfAccountRepository;

	@Autowired
	public ContaDeClienteService(ContaDeClienteRepository customerOfAccountRepository) {
		this.customerOfAccountRepository = customerOfAccountRepository;
	}

	// Method to save a new customerOfAccount
	public ContaDeCliente saveCustomerOfAccount(ContaDeCliente customerOfAccount) {
		return customerOfAccountRepository.save(customerOfAccount);
	}

}
