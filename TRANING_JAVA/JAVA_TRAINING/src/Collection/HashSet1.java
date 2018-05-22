/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author VINOTHVINO
 */
public class HashSet1 {
    public static void main(String args[])
    {
    	TreeSet<String> al=new TreeSet<String>();
    //  TreeSet al=new TreeSet();
        al.add("Vijay");
        al.add("Vinoth");
        al.add("Arun");
        al.add("ABAHBAHA");
        al.add("Vijay");
        al.add("Vinoth");
        al.add("cccccccccccc");
        al.add("DDDDDDDDDDDDDDDDD");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
        }
        
        
        
        
        
        
