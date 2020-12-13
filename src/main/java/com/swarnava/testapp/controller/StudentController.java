package com.swarnava.testapp.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swarnava.testapp.model.Student;
import com.swarnava.testapp.service.StudentService;



@RestController
public class StudentController {
	
	@Autowired
	StudentService stuService;
	
	@RequestMapping(method=RequestMethod.POST,value="/createStudent")
	public void createStudent(@RequestBody Student student) {
		
		stuService.createStudent(student);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/getAllStudents")
	public List<Student> getAllStudent(){
		
		List<Student> students = new ArrayList<Student>();
		
		students = (List<Student>) stuService.getAllStudents();
		
		return students;
	}
}
