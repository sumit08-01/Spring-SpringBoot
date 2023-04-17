package com.spring.mvc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.spring.mvc.model.Employee;

@Service
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	List<Employee> findByName(String name);
	
	@Query("from Employee where name= :sname")
	List<Employee> find(@Param("sname") String name);


}
