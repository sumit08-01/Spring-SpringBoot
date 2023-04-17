package com.assignment4;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class StudentConfig {

	
	@Bean(name = "Student1")
	public Student getStudent1() {
		List<Test> tests = List.of(new Test("101","core java", "1000"));
		Student student = new Student("10001","sumit", tests);
		return student;
	}
	
	@Bean(name = "Student2")
	public Student getStudent2() {
		List<Test> tests = List.of(new Test("102","Spring java", "100"), new Test("103", "sb", "105"));
		Student student = new Student("10002","sourabh", tests);
		student.setTest(tests);
		return student;
	}
	
	
	
	
	
}
