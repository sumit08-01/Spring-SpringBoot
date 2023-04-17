package com.spring.mvc.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.EmployeeRepo;
import com.spring.mvc.model.Employee;

import jakarta.annotation.PostConstruct;

//@Controller 

/*when you use this controller then you have to mention that at all methods that's return a json format value 
but if you don't want to use this, instead of @controller user @RestController

*/@RestController
public class EmployeeController {

	@Autowired(required = true)
	EmployeeRepo employeeRepo;
	
	@PostConstruct
	public void addEmployee() {
		List<Employee> employees = Arrays.asList(new Employee(101, "sumit"), new Employee(102, "sourabh"));
		employeeRepo.saveAll(employees);
	}
	
//	@GetMapping(path = "/employees", produces = {"application/xml"}) // you can send also response in the format of xml but add a dependency in jakson converted 
	@GetMapping(path = "/employees")
//	@ResponseBody // jackson is converted java into json it's a converter
	public List<Employee> getAllEmployee(){
		return employeeRepo.findAll();
	}
	
	
	@GetMapping("/employee/{id}")
//	@ResponseBody // you can remove this annotation beacuse you are using @RestControler top of the class
	public Employee getEmployeeById(@PathVariable int id){
		return employeeRepo.findById(id).orElse(new Employee(id, "No Employee is present for this id : "+id));
	}
	
	
	@PostMapping(path = "/addEmployee/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE}) // consumes = {MediaType.APPLICATION_JSON_VALUE} -->> This annotation is get data in the form of json format not any other format
	public Employee addEmployee(@RequestBody Employee employee) { // @RequestBody -->> get all the data from json and convert into java format, but if you not use this annotation then you can send the data in from in postman
//		return employeeRepo.save(new Employee(employee.getId(), employee.getName()));
		return employeeRepo.save(employee);
	}
	
}
