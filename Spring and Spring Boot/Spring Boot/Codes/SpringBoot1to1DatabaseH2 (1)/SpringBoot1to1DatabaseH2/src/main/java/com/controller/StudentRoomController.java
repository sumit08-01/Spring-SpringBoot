package com.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.StudentRepository;
import com.model.RoomRepository;

import com.model.Room;
import com.model.Student;

@RestController
public class StudentRoomController {
	@Autowired
	RoomRepository roomRepository;
	
	@Autowired
	StudentRepository studentRepository;

	@RequestMapping("/findAllDetails")
	public Iterable<Student> getAllDetails() {
		return studentRepository.findAll();
	}
	
	@RequestMapping(value = "/createAllDetails", method = RequestMethod.GET)
	public String createAllDetails()
	{
		Student s=new Student("Roger","roger@gmail.com");
		
		Room r=new Room("12 Lane,eindhoven");
		
		s.setRoom(r);
	
		studentRepository.save(s);
		
	    
	    return "<html><body bgcolor='springgreen'>Student and Room added successfully</body></html>";
	}

}
