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
	  
	

	  
	  public ModelAndView insert(Student stud) 
	  {
		System.out.println("Inserting...."); 
		  
	    studentDAO.save(stud);
		ModelAndView mv=new ModelAndView("success.jsp");
		String status=new String("Successfully added the student details");
		mv.addObject("status",status);
		return mv;	
	   }
	 
		
		
	  public ModelAndView fetch(int id) 
	  {
		  System.out.println("Fetching....");
		  
		  Student stud=studentDAO.findById(id).orElse(new Student());
		  ModelAndView mv=new ModelAndView("dashboard.jsp");
		  mv.addObject("id",stud.getId());
		  mv.addObject("name",stud.getName());
		  mv.addObject("cgpa",stud.getCgpa());
		  mv.addObject("location",stud.getLocation());
		  
		  return mv;
		  
	  }



}    
		
		
			

