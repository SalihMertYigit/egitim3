package com.jforce.tr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.tr.model.Student;
import com.jforce.tr.services.StudentServices;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class StudentController {

	@Autowired
	StudentServices studentServices;

	@RequestMapping(path = "/getStudentList", method = RequestMethod.GET)
	public List<Student> getListStudents() {
		return studentServices.getList();
	}

	@RequestMapping(path = "/getStudentById/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") Integer id) {

		return studentServices.getStudentByID(id);

	}

	@RequestMapping(path = "/deleteStudentById/{id}",method = RequestMethod.GET)
	public void deleteStudentById(@PathVariable("id") Integer id) {
		
		studentServices.deleteStudentById(id);
	}
	@RequestMapping(path = "/add",method = RequestMethod.POST)
	public void add(@RequestBody Student student) {
		studentServices.add(student);
	}
	
}
