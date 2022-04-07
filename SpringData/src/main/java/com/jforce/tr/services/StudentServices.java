package com.jforce.tr.services;

import java.util.List;

import com.jforce.tr.model.Student;


public interface StudentServices {
	List<Student> getList();
	Student getStudentByID(Integer id);
	void deleteStudentById(Integer id);
	void add(Student student);
}
