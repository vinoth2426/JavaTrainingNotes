/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class HsahMap {
    public static void main(String args[])
  {
        // create HashMap
    	// Creating a HashMap of int keys and String values
       LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
       // HashMap<Integer, String> hm = new HashMap<Integer, String>();
     
        // Adding Key and Value pairs to HashMap
        hm.put(66, "A");
        hm.put(11,"Value1");
        hm.put(22,"Value2");
        hm.put(33,"raja");
        hm.put(44,"raja");
        hm.put(55,"vinoth");
        hm.put(55,"Raja RAM");
       
        
      //hm.remove(11);
     
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
        