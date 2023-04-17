package com.assignment4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("Assignment solotion 4");
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/assignment4/Config.xml");
//		Student student = context.getBean("Student", Student.class);
//		Student student2 = context.getBean("Student2", Student.class);
//		System.out.println(student);
//		System.out.println(student2);
//		context.close();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student1 =  context.getBean("Student1", Student.class);
		Student student2 =  context.getBean("Student2", Student.class);
		System.out.println(student1);
		System.out.println(student2);
		context.close();
//		
	}

}
