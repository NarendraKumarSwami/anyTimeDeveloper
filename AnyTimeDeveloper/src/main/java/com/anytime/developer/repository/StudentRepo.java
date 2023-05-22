package com.anytime.developer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anytime.developer.model.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
     
	
	public Optional<Student>  findByName(String name);
}
