package com.springcore.LifeCycle;

public class Example {
	private String subject;

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	@PostCont
	public void start() {
		System.out.println("starting method");
	}
	public void end() {
		System.out.println("ending method");
	}
}

