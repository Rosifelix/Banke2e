package br.com.e2etreinamentos.banke2etreinamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.e2etreinamentos.banke2etreinamentos.model.ContaDeCliente;
import br.com.e2etreinamentos.banke2etreinamentos.service.ContaDeClienteService;

@RestController
@RequestMapping("/api/contacliente")
public class ContaDeClienteController {

    @Autowired
    private ContaDeClienteService customerOfAccountService;

    @PostMapping
    public ResponseEntity<ContaDeCliente> createCustomerOfAccount(@RequestBody ContaDeCliente customerOfAccount) {
        ContaDeCliente savedCustomerOfAccount = customerOfAccountService.saveCustomerOfAccount(customerOfAccount);
        return new ResponseEntity<>(savedCustomerOfAccount, HttpStatus.CREATED);
    }

    // Add more controller methods as needed
}
