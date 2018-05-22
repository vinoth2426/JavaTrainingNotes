package com.javatpoint.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
public static void main(String[] args) {
	
	//creating configuration object
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
	
	//creating seession factory object
	SessionFactory factory=cfg.buildSessionFactory();
	
	//creating session object
	Session session=factory.openSession();
	
	//creating transaction object
	Transaction t=session.beginTransaction();
		
	Employee e1=new Employee();
	e1.setId(123);
	e1.setFirstName("RAJA");
	e1.setLastName("RAM");
	e1.setEmail("abc@gmail.com");
	session.persist(e1);//persisting the object
	Employee e2=new Employee();
	e2.setId(124);
	e2.setFirstName("ViJAY	");
	e2.setLastName("RAM");
	e2.setEmail("ccc@gmail.com");
	session.persist(e2);//persisting the object
	
	t.commit();//transaction is commited
	session.close();
	factory.close();
	System.out.println("successfully saved");
	
}
}
