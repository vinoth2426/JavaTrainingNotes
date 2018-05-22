package Collection.Set;

import java.util.*;

public class SampleSet1 {
	public static void main(String args[])
	{
		
	Set s =new HashSet();
	
	s.add("C");
	s.add("D");
	s.add("B");
	s.add("A");
	s.add("A");
	s.add(null);
	s.add(10);
	
	Iterator itr= s.iterator();
			{
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
			}
	

}
}