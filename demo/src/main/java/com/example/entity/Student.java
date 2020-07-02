package com.example.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
 


@Entity
public class Student{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "idSeq")
	@SequenceGenerator(name="idSeq", sequenceName="STUDENT_SEQ", allocationSize=1)
	private Integer id;
	private String name;
	private String cgpa;
	private String location;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
   
	
	
	

	
	
}
