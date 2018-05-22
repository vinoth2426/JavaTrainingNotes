package str;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ForOurLogic { 

	public static void main(String[] args)
	{
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();		
	
		Vendor v =new Vendor();
        
        v.setVendorId(103);
        v.setVendorName("MANYTOONE");
        
        
        Customers c1=new Customers();
         
         c1.setCustomerId(509);
         c1.setCustomerName("CustomerDetails1");
         c1.setParent(v);
         
         Customers c2=new Customers();
         
         c2.setCustomerId(510);
         c2.setCustomerName("CustomerDetails2");
         c2.setParent(v);
         
         Customers c3=new Customers();
         
         c3.setCustomerId(511);
         c3.setCustomerName("CustomerDetails3");
         c3.setParent(v);         		             
         

          
Transaction tx = session.beginTransaction();
            
                  //session.save(v);
                 session.save(c1);
                 session.save(c2);
                 session.save(c3);
                 
tx.commit();
session.close();
System.out.println("Many to One with annotation done...!!");
factory.close();
         
	}
	
}
