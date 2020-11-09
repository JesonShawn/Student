package com.example.daoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.StudentDAO;
import com.example.entity.Student;

import com.example.dao.StudentDAO;


public class StudentDAOImpl  {
	
	
	
	  @Autowired
	  public StudentDAO studentDAO;
	  
	

	  
	  public void insert(Student stud) 
	  {
		System.out.println("Inserting...."); 
		
	    studentDAO.save(stud);
	  
		
	   }
	 
		
		
	  public Student fetch(int id) 
	  {
		  System.out.println("Fetching....");
          Student stud=studentDAO.findById(id).orElse(new Student());
		  return stud;
		  
	  }



}    
		
		
			

