package com.example.daoImpl;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDAO;
import com.example.entity.Student;
 
/*Do not use this class--> contain extra code for reference*/

@Service
public class Extra  {
	
	
	
      @Autowired
	  StudentDAO studentDAO;
	
	
	/*private static final SessionFactory sessionFactory;
    static {
        try {
        	
        	
        	System.out.println("Inside static Block");
        	
        	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
        	
        	sessionFactory = con.buildSessionFactory();
        	
        	System.out.println("Inside static Block--- Exit");
        	
        	 
			   second code
			 * Configuration configuration = new
			 * Configuration().configure("hibernate.cfg.xml");
			 * 
			 * StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			 * .applySettings(configuration.getProperties());
			 * 
			 * 
			 * sessionFactory = configuration.buildSessionFactory(builder.build());
			 * 
			 
        	
        	
			 First code
			 * sessionFactory = new Configuration() .configure("hibernate.cfg.xml")
			 * .addPackage("com.example.entity") .addAnnotatedClass(Student.class)
			 * .buildSessionFactory();
			 * 
			 
            
        } catch (Throwable ex) {
            // Log exception!
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession()
            throws HibernateException {
    	
    	
    	System.out.println("Inside session Block");
        return sessionFactory.openSession();
        
        
        
    }
	
	
	
	public void insert()
	{
		
		System.out.println("Inside Insert StudentDAOImpl");
		
		
		
		 * StandardServiceRegistry ssr = new
		 * StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		 * System.out.println("ssr");
		 * 
		 * Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		 * 
		 * System.out.println("Meta");
		 * 
		 * SessionFactory factory = meta.getSessionFactoryBuilder().build();
		 
		 
		 
		
		
		Session session = getSession();  
		
		            
		    Student s1=new Student();    
		    s1.setId(101);    
		    s1.setName("Hibernate");   
		    s1.setLocation("AMS");
		    s1.setCgpa("8.5");
		        
		    Transaction t = session.beginTransaction();   
		    session.save(s1);  
		  //  t.commit(); 
		    
		    System.out.println("Successfully saved to DB");  
		    sessionFactory.close();  
		    session.close();    
		        */





	public void insert()
	{
		
		System.out.println("Inside Insert StudentDAOImpl");
		 
		            
		    Student s1=new Student();    
		    s1.setId(101);    
		    s1.setName("Hibernate");   
		    s1.setLocation("AMS");
		    s1.setCgpa("8.5");

		   System.out.println("Entity/Bean created-->Goign to persist");
		  
		    System.out.println(studentDAO.save(s1));
		    
		    
		    
}    
		
		
			



}    
		
		
			

