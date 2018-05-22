package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemoveAll {
	public static void main(String args[]){  
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Vijay");  
		  al.add("Ajay");  
		  al.add("Raja");  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("vinoth");  
		  al.remove(1);
		  al.removeAll(al2);  
		  System.out.println("iterating the elements after removing the elements of al2...");  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  }  
}
