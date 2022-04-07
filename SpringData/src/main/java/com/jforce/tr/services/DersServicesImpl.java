package com.jforce.tr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforce.tr.model.Ders;
import com.jforce.tr.model.Student;
import com.jforce.tr.repository.DersRepository;
import com.jforce.tr.repository.StudentRepository;


@Service
public class DersServicesImpl implements DersServices{

	
	@Autowired
	DersRepository dersRepository;
	@Override
	public List<Ders> getList() {
		
		
		return dersRepository.findAll();
	}

	
	
}
