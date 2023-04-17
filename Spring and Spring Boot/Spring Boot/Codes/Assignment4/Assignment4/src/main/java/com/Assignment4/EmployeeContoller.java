package com.Assignment4;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeContoller {

	private Map<String, Employee> Emps = new ConcurrentHashMap<String, Employee>();
	
	public EmployeeContoller() {
		 
		Emps.put("101" , new Employee("101","sumit","sumit.141@wipro.com","ghaziabad"));
		Emps.put("102" , new Employee("102","sourab","sourabh.gautam@wipro.com","delhi"));
	}
	
	 @GetMapping
	 public Map<String, Employee> getEmps() {
		 return Emps;
	 }
	 
	 @GetMapping("/{EmpID}")
	 public Employee getEmployee(@PathVariable("EmpID") String EmpID) {
		 return Emps.get(EmpID);
	 }
	 
//	 @PostMapping(path="/post", consumes=MediaType.APPLICATION_JSON_VALUE)
//	 public Employee addEmployee(@RequestBody Employee employee) {
//		return Emps.put(employee.getEmpID(), employee);
//	 }
		
	@PostMapping(path="/post", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
		Emps.put(employee.getEmpID(), employee);
	return new ResponseEntity<Object>(HttpStatus.CREATED);
	}
		
	@PutMapping(path = "/{EmpID}" , consumes=MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> upDateEmployee(@RequestBody Employee employee) 
	{
		if(Emps.containsKey(employee.getEmpID())) {
			Emps.put(employee.getEmpID(), employee);
			return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
		
	@DeleteMapping("/{EmpID}")
	public ResponseEntity<Object> deleteEmpId (@PathVariable("EmpID") String EmpID){
		if(Emps.containsKey(EmpID)) {
			Emps.remove(EmpID);
			return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
