package com.assignment5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("Assignment solotion 5");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PlayerConfig.class);
		Player player1 = context.getBean("p1", Player.class);
		System.out.println(player1);
		Player player2 = context.getBean("p2", Player.class);
		System.out.println(player2);
		Player player3 = context.getBean("p3", Player.class);
		System.out.println(player3);
		Player player4 = context.getBean("p4", Player.class);
		System.out.println(player4);
		Player player5 = context.getBean("p5", Player.class);
		System.out.println(player5);
		
		context.close();
		
	}

}
