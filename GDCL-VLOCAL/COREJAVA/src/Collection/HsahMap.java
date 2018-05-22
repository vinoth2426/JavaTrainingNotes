/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class HsahMap {
    public static void main(String args[])
  {
        // create HashMap
    	// Creating a HashMap of int keys and String values
      //  HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
     
        // Adding Key and Value pairs to HashMap
        hm.put(11,"Value1");
        hm.put(22,"Value2");
        hm.put(33,"Value3");
        hm.put(44,"Value4");
        hm.put(55,"Value5");
     
        // Getting a Set of Key-value pairs
        Set entrySet = hm.entrySet();
     
        // Obtaining an iterator for the entry set
        Iterator it = entrySet.iterator();
     
        // Iterate through HashMap entries(Key-Value pairs)
        System.out.println("HashMap Key-Value Pairs : ");
        while(it.hasNext()){
           Map.Entry me = (Map.Entry)it.next();
           System.out.println("Key is: "+me.getKey() + 
           " & " + 
           " value is: "+me.getValue());
       }
     }
}
        