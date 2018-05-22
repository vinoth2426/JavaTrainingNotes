package str;

import org.hibernate.*;
import org.hibernate.cfg.*;
 
public class ClientForSave { 
 
    public static void main(String[] args)
    {
 
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); 
 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
       
        Object o=session.load(Product.class,new Integer(105));
        Product p=(Product)o;
         
        Transaction tx = session.beginTransaction();
        session.delete(p);
        System.out.println("Object Deleted successfully.....!!");
        tx.commit();
        session.close();
        factory.close();
    }
 
}
