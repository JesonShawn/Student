package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;

import com.example.daoImpl.StudentDAOImpl;
import com.example.entity.Student;


@RestController
public class MainController {
	
	@Autowired
	StudentDAOImpl studentDAOImpl;
	
	
	@GetMapping("/ping")
	public String ping()
	{	
		System.out.println("Inside Ping\n");
		return "Testing Ping";	
	}
	
	
	
	@GetMapping("/error")
	public String error()
	{
		System.out.println("Inside Error\n");
		return "This is a generic error! ";	
	}
	
	
	
	@PostMapping(value="/create" , produces = { MediaType.APPLICATION_JSON_VALUE})
	public ModelAndView setStudentDetails(Student stud)
	{
		System.out.println("Hello : Inside getStudentDetails\n"+stud.getName());
		
		
		
		
		ModelAndView mv=studentDAOImpl.insert(stud);
		return mv;
		
	}
	
	
	@GetMapping("/fetch")
	public ModelAndView postStudentDetails(@RequestParam int id)
	{
		System.out.println("Inside postStudentDetails\n"+id);
		ModelAndView mv=studentDAOImpl.fetch(id);
		return mv;
	}
	

	
}