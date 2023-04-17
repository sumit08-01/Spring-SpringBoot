package com.training.SpringBootMySql;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.model.Account;
import com.model.AccountRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.model")
@EntityScan(basePackages="com.model")
@EnableAutoConfiguration
@ComponentScan(basePackages="com.controller")
public class SpringBootDatabaseEgOracleDB {
	@Autowired
	AccountRepository accountRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDatabaseEgOracleDB.class, args);
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Inside save");
		Account a1 = new Account("Savitha", "Sridhar", "savitha@gmail.com");
		Account a2 = new Account("Gayathri", "Nelavigi", "gayathri@gmail.com");
		Account a3 = new Account("Sheetal", "Kamat", "sheetal@gmail.com");
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(a1);accounts.add(a2);accounts.add(a3);
		System.out.println(" before saved");
		accountRepository.saveAll(accounts);
		System.out.println(" saved");
	}
}
