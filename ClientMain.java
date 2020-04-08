package com.virtusa.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.hibernate.entity.AdminDetails;
import com.virtusa.hibernate.entity.Employee;

public class ClientMain {
	public static void main(String ...mdr) {
		//Employee employee=new Employee();
		
		//AdminDetails adminDetails=new AdminDetails(100,"ram","ram@gmail.com","ram@123");
				
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory =  config.buildSessionFactory(); 
//		Session session=factory.openSession();
//		Transaction transaction=session.beginTransaction();
//		
//		session.save(adminDetails);
//		transaction.commit();
//		
//		
//		session.close();
	}

}
