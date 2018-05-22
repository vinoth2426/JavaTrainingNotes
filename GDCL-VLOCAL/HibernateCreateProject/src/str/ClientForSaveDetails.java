package str;

import org.hibernate.*;
import org.hibernate.cfg.*;
 
public class ClientForSaveDetails { 
 
    public static void main(String[] args)
    {
 
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); 
 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Product p=new Product(); 
 
        p.setProductId(106);
        p.setProName("BC");
        p.setPrice(15000);
 
        Transaction tx = session.beginTransaction();
        session.save(p);
        System.out.println("Object saved successfully.....!!");
        tx.commit();
        session.close();
        factory.close();
    }
 
}
