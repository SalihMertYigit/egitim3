package com.jforce.tr.services;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforce.tr.model.Student;
import com.jforce.tr.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServices {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getList() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentByID(Integer id) {
		Student student = null;
		try {
			student = studentRepository.findById(id).get();
		} catch (Exception e) {
			System.out.println("Id ye denk gelen student bulunamadı");
		}
		if (student == null) {
			student = new Student();
		}
		return student;
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);

	}

	public void add(Student student) {
		
		studentRepository.save(student);
		
		
	}

}
