package br.com.e2etreinamentos.banke2etreinamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.e2etreinamentos.banke2etreinamentos.model.ContaBanco;
import br.com.e2etreinamentos.banke2etreinamentos.service.ContaBancoService;

@RestController
@RequestMapping("/api/contabanco")
public class ContaBancoController {
	
	
	 @Autowired
	    private ContaBancoService bankAccountService;

	    @PostMapping
	    public ResponseEntity<ContaBanco> createBankAccount(@RequestBody ContaBanco bankAccount) {
	        ContaBanco savedBankAccount = bankAccountService.saveBankAccount(bankAccount);
	        return new ResponseEntity<>(savedBankAccount, HttpStatus.CREATED);
	    }

}
