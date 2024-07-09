package br.com.e2etreinamentos.banke2etreinamentos.model;

import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ContaBanco {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String accountNumber;
	    private String accountType;
	    private double balance;
	    
	 // New field to store the customerId
		private Long customerId;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		// Getter and setter for customerId
		public Long getCustomerId() {
			return customerId;
		}

		
		
		  // Method to generate a unique account number based on the customer ID
	    private String generateUniqueAccountNumber(Long customerId) {
	        // Generate a random number starting from 1000000
	        Random random = new Random();
	        int randomNumber = random.nextInt(9000000) + 1000000;
	        return String.valueOf(randomNumber) + customerId;
	    }

	    // Setter for customerId, which also generates the account number
	    public void setCustomerId(Long customerId) {
	        this.customerId = customerId;
	        this.accountNumber = generateUniqueAccountNumber(customerId);
	    }
		
		
	    
	    
}