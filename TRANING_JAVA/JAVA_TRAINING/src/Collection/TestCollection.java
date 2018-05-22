/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;


import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author VINOTHVINO
 */
public class TestCollection {
    public static void main(String args[])
    {
        Student s1=new Student(100,"arun",24);
        ArrayList<Student> a1=new ArrayList<Student>();
        a1.add(s1);
        Iterator itr=a1.iterator();
        while(itr.hasNext())
        {
            Student st=(Student)itr.next();
            System.out.println(st.rollno+"  "+st.name+"  "+st.age);
        }
        
        
    }
    
}
