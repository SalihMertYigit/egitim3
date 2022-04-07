package com.jforce.tr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.tr.model.Ders;
import com.jforce.tr.model.Student;
import com.jforce.tr.services.DersServices;



@RestController
public class DersController {
	
	@Autowired
	DersServices dersServices;
	@RequestMapping(path = "/getDersList",method = RequestMethod.GET)
	public List<Ders> getListStudents(){
		return dersServices.getList();
	}
}
