package com.jforce.tr.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
@Entity
@Table(name = "student")
public class Student {
	@Id
	private Integer Id;
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastNameString;
	
	
	
	

	public Student() {
		
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNameString() {
		return lastNameString;
	}

	public void setLastNameString(String lastNameString) {
		this.lastNameString = lastNameString;
	}
	
	
}
