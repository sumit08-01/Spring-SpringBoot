package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController // work as api
//@Controller // work as mvc
public class EmpController {

	@Autowired	
	EmployeeService employeeService;
	
	
	
	List<Employee> employees = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		Employee employee1 = new Employee(101, "sumit", "sumitgond9999@gmail.com", "Ghaziabad");
		Employee employee2 = new Employee(102, "sourabh", "sourabh@gmail.com", "Ghaziabad");
		employeeService.save(employee1);
		employeeService.save(employee2);
	}
	
	@GetMapping("/get")
//	public String allDetails(Model m) {     // with controller
		public List<Employee> allDetails() {  // with rescontroller
		System.out.println(employeeService.findAll());
//		List<Employee> findAll = employeeService.findAll();
//		m.addAttribute("emps", findAll);
//		return "allDetails";  // with controller
		return employeeService.findAll();  // with rescontroller
	}
	
	@PostMapping("/submit")
//	public String addEmployee(@RequestParam("id") String id , @RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("location") String location, Model model) {
		public String addEmployee(@RequestBody Employee employee, Model model) {
		System.out.println(employee.toString());
//		employeeService.save(new Employee(Integer.parseInt(id), name, email, location));
		employeeService.save(new Employee(employee.getEmpId(), employee.getEmpName(), employee.getEmail(), employee.getLocation()));
		List<Employee> findAll = employeeService.findAll();
		model.addAttribute("emps", findAll);
		return "allDetails";  // with controller
//		return "Details Added To DataBase";  // with rescontroller
	}
	
	@GetMapping("/display/{id}")
//	public String getById(@PathVariable("id") String EmpId , Model model) {
		public List<Employee> getById(@PathVariable("id") String EmpId , Model model) {
		Optional<Employee> findById = employeeService.findById(Integer.parseInt(EmpId));
		model.addAttribute("emps", findById.stream().collect(Collectors.toList()));
//		return "allDetails";
		return findById.stream().collect(Collectors.toList());
		
	}
	
}
