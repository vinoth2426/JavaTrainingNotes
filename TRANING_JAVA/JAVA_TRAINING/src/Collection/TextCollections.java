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
public class TextCollections 
    {
        public static void main(String args[])
        {
            ArrayList<String> a1=new ArrayList<String>();
            a1.add("vijay");
            a1.add("Raj");
            a1.add( "Ravi");
            a1.add("Raj");
            a1.add("Raj");
            
            Iterator itr=a1.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
            System.out.println(a1);
        }
}
        
