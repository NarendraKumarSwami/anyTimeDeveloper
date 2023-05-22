package com.anytime.developer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anytime.developer.error.StudentExceptions;
import com.anytime.developer.model.Student;
import com.anytime.developer.repository.StudentRepo;

@Service
public class StudentService {
	

	  @Autowired
	  public StudentRepo stRepo;
       
	  public Student createStudent(Student st) {
		     
		 return stRepo.save(st);
		  
	  }
	  
	  
	  public Student getStudentById(Integer id) {
		      
		  return stRepo.findById(id).orElseThrow(()-> new StudentExceptions("There is not student with this id: "+id));
				
	  }
	  
	  public List<Student> getAllStudent() {
		   return stRepo.findAll();
	  }
	  
	  public Student getStudentByName(String name){
		    return stRepo.findByName(name).orElseThrow(() -> new StudentExceptions("There is no student with this name: "+name));
	  }
	  
	  public Student deleteStudent(Integer id) {
		  
		   Student st =  this.getStudentById(id);
		  
		   stRepo.delete(st);
		   
		   return st;
	  }
	  
	  public Student updateStudent(Student st) {
		     
		  Student stold = this.getStudentById(st.getId());
		   
		   if(st.getName() != null) {
			      stold.setName(st.getName());
		   }
		   
		   if(st.getProfile() != null) {
			      stold.setProfile(st.getProfile());
		   }
		   
		   if(st.getGender() != null) {
			    stold.setGender(st.getGender());
		   }
		      
		   return   stRepo.save(stold);
	  }
}
