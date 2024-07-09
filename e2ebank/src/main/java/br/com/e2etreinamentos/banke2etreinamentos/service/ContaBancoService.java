package br.com.e2etreinamentos.banke2etreinamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.e2etreinamentos.banke2etreinamentos.model.ContaBanco;
import br.com.e2etreinamentos.banke2etreinamentos.repository.ContaBancoRepository;

@Service
public class ContaBancoService {

	@Autowired
    private ContaBancoRepository bankAccountRepository;

    @Autowired
    private ClienteService customerService;

    public ContaBanco saveBankAccount(ContaBanco bankAccount) {
    	 
        Long customerId = bankAccount.getCustomerId();
        
       
        customerService.getClienteById(customerId).orElseThrow(() -> new RuntimeException("Customer not found"));
        
        
        ContaBanco savedBankAccount = bankAccountRepository.save(bankAccount);
        
       
        savedBankAccount.setCustomerId(customerId);
        
        return savedBankAccount;
    }
	
}
