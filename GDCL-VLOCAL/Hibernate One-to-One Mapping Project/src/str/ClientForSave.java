package str;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ClientForSave {
	public  static  void main(String args[])
	{
		
		AnnotationConfiguration cfg=new AnnotationConfiguration();
	    cfg.configure("hibernate.cfg.xml");	        
	 
	    SessionFactory factory = cfg.buildSessionFactory();
	    Session session = factory.openSession();
		
		Student  s = new Student();
		s.setStudentId(102);
		s.setStudentName("RAM");
		s.setGrp("MBA");
		
		Address  ad = new Address();
		ad.setAddressId(2);
		ad.setPlace("MUMBAI");
		
		ad.setParent(s);
		Transaction  tx = session.beginTransaction();
		session.save(ad);
		tx.commit();
		session.close();
		System.out.println("One to One with annotations is done..!!!!");
		factory.close();
	}
}
