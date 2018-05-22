package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddallMethod {
	public static void main(String args[]){  
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("ARJUN");  
		  al2.add("TAMIL");  
		  
		  al.addAll(al2);//adding second list in first list  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
}
