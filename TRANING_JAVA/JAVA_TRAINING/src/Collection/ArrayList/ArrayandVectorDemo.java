package Collection.ArrayList;
// Vector-Dynamic Array List
import java.util.Iterator;
import java.util.Vector;
public class ArrayandVectorDemo {

	public static void main(String args[])
	{
		Vector<Integer> v=new Vector<Integer>();
		
		v.add(2);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(9);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(5);
		v.add(6);
		v.add(7);
		
		System.out.println(v.capacity());
		
		  Iterator<Integer> itr=v.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}
}
