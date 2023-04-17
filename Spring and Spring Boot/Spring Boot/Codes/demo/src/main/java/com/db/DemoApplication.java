package com.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.db.dao.UserRepository;
import com.db.entity.User;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class);
		
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("sumit");
		user.setCity("delhi");
		user.setStatus("PG");
		
		User user1 = userRepository.save(user);
		
		System.out.println(user1);
	}

}
