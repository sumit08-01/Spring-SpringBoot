package com.springcore.LifeCycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Price");
		this.price = price;
	}

	public Samosa() {
		super();
		
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() { //we can change inti to anythingh 
		System.out.println("Inside init method");
	}
	public void destroy() { //we can change destroy to anythingh 
		System.out.println("Inside destroy method");
	}
}

