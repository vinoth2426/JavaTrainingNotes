/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author VINOTHVINO
 * add,order,put//same
 * element//same
 * peek
 * remove
 * poll
 * 
 */
public class Queue {
    public static void main(String args[])
    {
       PriorityQueue<String> queue=new PriorityQueue<String>();
       queue.add("A");
       queue.add("B");
       queue.add("C");
       queue.add("D");
       System.out.println("Head"+queue.element());
       System.out.println("Head"+queue.peek());
       System.out.println("Iterating The Queue Element");
       Iterator itr=queue.iterator();
       while(itr.hasNext())
       {
           System.out.println(itr.next());
       }
       queue.remove();
       queue.poll();
       System.out.println("After Removing Two Elements");
       Iterator<String> itr2=queue.iterator();
       while(itr2.hasNext())
       {
           System.out.println(itr2.next());
       }
       
    }    
    
    
    
    
}
