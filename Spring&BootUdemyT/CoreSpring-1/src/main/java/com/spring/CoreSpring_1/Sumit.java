package com.spring.CoreSpring_1;

public class Sumit {
	
//	int age; // always make you data member private
	private int age;
	
//	private MyLaptop laptop;
	private Computer com;
	
	// Default Constructor
	public Sumit() {
	System.out.println("Sumit class constructor called mean spring creating the object of that class, even if we don't need, because spring responsibility to created object of the class");
}
	
	//Parametrized constructor with age value
	public Sumit(int age) {
		this.age = age;
	}
	
	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("set age called");
		this.age = age;
	}
 
//	public MyLaptop getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(MyLaptop laptop) {
//		this.laptop = laptop;
//	}

	
	
	//Methods in class
	public void coding() {
		System.out.println("Sumit Coding");
//		laptop.compile();
		com.compile();
	}



	
}
