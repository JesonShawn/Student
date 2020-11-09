package com.example;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;

import com.example.daoImpl.StudentDAOImpl;
import com.example.entity.Student;
import com.example.response.Success;


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
		studentDAOImpl.insert(stud);
		ModelAndView mv=new ModelAndView("success.jsp");
		String status=new String("Successfully added the student details");
		mv.addObject("status",status);
		return mv;	
		
	}

	
	@PostMapping(value="/create-object" , produces = { MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Success setStudentDetailsAPI(@RequestBody Student stud,@RequestHeader("consumerId") String header)
	{
		
		System.out.println("consumerID" +header);
		System.out.println("Hello : Inside getStudentDetailsAPI\n"+stud.getName());
		studentDAOImpl.insert(stud);
		
		Success response = new Success();
		response.setRef("API Ref");
		response.setMessage("CREATED");
		
       
        
        ArrayList l = new ArrayList(1);
        
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(5);
        l.add(5);
        System.out.println("ssssss"+l.size());
        
        		
        		 return response; 
	}
	
	
	
	
	@GetMapping("/fetch")
	public ModelAndView postStudentDetails(@RequestParam int id)
	{
		System.out.println("Inside postStudentDetails\n"+id);
		Student stud = studentDAOImpl.fetch(id);
		ModelAndView mv=new ModelAndView("dashboard.jsp");
		mv.addObject("id",stud.getId());
		mv.addObject("name",stud.getName());
		mv.addObject("cgpa",stud.getCgpa());
		mv.addObject("location",stud.getLocation());
		return mv;
	}
	

	
}