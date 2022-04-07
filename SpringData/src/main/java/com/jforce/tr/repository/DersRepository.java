package com.jforce.tr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jforce.tr.model.Ders;



@Repository
public interface DersRepository extends JpaRepository<Ders, Integer>{

	
	
}




