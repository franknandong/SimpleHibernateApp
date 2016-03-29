package com.fndong.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Retrieve {
	public static void main(String[] args) {  
	      
	    //creating configuration object  
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      System.out.println(" get property : " + cfg.getProperties());
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction trans=session.beginTransaction();  
	          
	    User user =new User();  
	    user.setUserId(1);
	    user.setName("Franko");
	    user.setEmail("Frankey");  
	    user.setPassword("P@ssw0rd"); 
	    
	  //persisting the object  
	    session.merge(user);
	    
	  //transaction is committed 
	    trans.commit(); 
	    session.close();  
	      
	    System.out.println("successfully created");  
	      
	}  
}
