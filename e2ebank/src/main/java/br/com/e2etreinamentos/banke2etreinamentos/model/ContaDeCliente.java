package br.com.e2etreinamentos.banke2etreinamentos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ContaDeCliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Cliente customer;

    @OneToOne
    private ContaBanco bankAccount;

    // Additional fields specific to the relationship between customer and account
    private String accountType; // e.g., savings, checking
    private boolean isPrimaryAccountHolder;

    // Constructors, getters, and setters
    // Constructor(s) if needed

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCustomer() {
        return customer;
    }

    public void setCustomer(Cliente customer) {
        this.customer = customer;
    }

    public ContaBanco getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(ContaBanco bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean isPrimaryAccountHolder() {
        return isPrimaryAccountHolder;
    }

    public void setPrimaryAccountHolder(boolean primaryAccountHolder) {
        isPrimaryAccountHolder = primaryAccountHolder;
    }
}
