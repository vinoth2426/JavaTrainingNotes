package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String args[])
    {
    Deque dqueue =new ArrayDeque();
    dqueue.add("A");
    dqueue.add("B");
    
    System.out.println("Initizal size of deque:"+dqueue.size());
    System.out.println("Deque Peek:"+dqueue.peek());
    System.out.println("Deque Poll:"+dqueue.poll());
    System.out.println("The Size Of Deque:"+dqueue.size());
    }
    
    }