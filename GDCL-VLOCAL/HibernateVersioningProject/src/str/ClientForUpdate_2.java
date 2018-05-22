package str;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ClientForUpdate_2 { 

	public static void main(String[] args)
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
		Object o=session.load(Product.class,new Integer(105));		 
		Product s=(Product)o;
		
		Transaction tx = session.beginTransaction();	
		
			//s.setStno(105);  should not update, because we loaded with that number right..?
		    s.setPrice(45800);		// implicitly update method will be called..
		    s.setProName("DELL");                                // This is always recomanded Way... 
		
		tx.commit();
		
		
		System.out.println("Object Updated successfully.....!!");	
		session.close();
		factory.close();
	}
	
}
