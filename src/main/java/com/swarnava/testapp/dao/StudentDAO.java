package com.swarnava.testapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.swarnava.testapp.model.Student;

public interface StudentDAO extends CrudRepository<Student, String> {

	

}
