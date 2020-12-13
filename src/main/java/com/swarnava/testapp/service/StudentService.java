package com.swarnava.testapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swarnava.testapp.dao.StudentDAO;
import com.swarnava.testapp.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDAO stuDao;

	public void createStudent(Student student) {
		//System.out.println("Hello from service " + student.getFname());
		
		stuDao.save(student);
		
	}
	
	public List<Student> getAllStudents(){
		
		return (List<Student>) stuDao.findAll();
	}

}
