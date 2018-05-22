package str;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ForOurLogic_2 { 

	public static void main(String[] args)
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();	
		
		Product p=new Product();
		p.setProductId(105);  // 105 must be in the DB
		p.setProName("Someting");		
		 
				
		Transaction tx = session.beginTransaction();		
			session.update(p);		
		tx.commit();
		
		
		System.out.println("Object Updated successfully.....!!");	
		session.close();
		factory.close();
	}
	
}
