package br.com.e2etreinamentos.banke2etreinamentos.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class AccountNumberGenerator {
	
	 private static final int MIN_ACCOUNT_NUMBER = 1000000;
	    private static final int MAX_ACCOUNT_NUMBER = 9999999;
	    private Set<String> usedAccountNumbers = new HashSet<>();
	    private Random random = new Random();

	    public String generateUniqueAccountNumber() {
	        while (true) {
	            int randomNumber = random.nextInt(MAX_ACCOUNT_NUMBER - MIN_ACCOUNT_NUMBER + 1) + MIN_ACCOUNT_NUMBER;
	            String accountNumber = String.valueOf(randomNumber);
	            if (!usedAccountNumbers.contains(accountNumber)) {
	                usedAccountNumbers.add(accountNumber);
	                return accountNumber;
	            }
	        }
	    }

}
