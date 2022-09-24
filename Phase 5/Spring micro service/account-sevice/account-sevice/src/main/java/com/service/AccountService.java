package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Account;
import com.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public String createAccount(Account account) {
		Optional<Account> op = accountRepository.findById(account.getAccno());
		if(op.isPresent()) {
			return "Account number must be unique";
		}else {
			accountRepository.save(account);
			return "Account created successfully";
		}
	}
	
	public String findBalance(int accno) {
		Optional<Account> op = accountRepository.findById(accno);
		if(op.isPresent()) {
			Account ac  = op.get();
			return "Your account balance is "+ac.getAmount();
		}else {
				return "Account is not present";
		}
	}
}
