package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class DequeExample {
	public static void main(String[] args) {  
		ArrayDeque<String> deque=new ArrayDeque<String>();  
	    deque.add("arvind");  
	    deque.add("vimal");  
	    deque.add("mukul");  
	    deque.offerFirst("jai");  
	   deque.offerLast("ViNOTH");// First Order Values Dispaly
	    System.out.println("After offerFirst Traversal...");  
	       Iterator itr=deque.iterator();
	       while(itr.hasNext())
	       {
	           System.out.println(itr.next());
	       }
	    deque.poll();  // Remove top of the first Values
	    deque.pollFirst();//it is same as poll()  // Remove first values
	    deque.pollLast();// Remove Last Values  
	    System.out.println("After pollLast() Traversal...");  
	    Iterator itr1=deque.iterator();
	       while(itr1.hasNext())
	       {
	           System.out.println(itr1.next());
	       }
	}  
}
