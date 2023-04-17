package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Account;
import com.model.AccountRepository;

@RestController
@EnableAutoConfiguration
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;

	@RequestMapping("/accounts")
	public Iterable<Account> getAllAccounts() {
		return accountRepository.findAll();
	}
	
	@RequestMapping(value = "/addAccount", method = RequestMethod.POST)
	public String addAccount(@ModelAttribute("fname") String fname,@ModelAttribute("lname") String lname,@ModelAttribute("email") String email)
	{
		Account a=new Account(fname,lname,email);
		
	    accountRepository.save(a);
	    return "<html><body bgcolor='coral'>Added Account Successfully<br><a href='/accounts'>View All Accounts</a></body></html>";
	}

}
