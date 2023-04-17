package com.employee;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {

	@Id
	public Integer empId ;
	
	public String empName;
	public String email;
	public String location;
	
	public Employee() {
	}

	public Employee(Integer empId, String empName, String email, String location) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.location = location;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", location=" + location
				+ "]";
	}
	
	
	
	
	
}
