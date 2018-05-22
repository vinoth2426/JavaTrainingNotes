package Collection.Set;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<Integer> setNumbers = new TreeSet<>();
		 
		setNumbers.addAll(Arrays.asList(2, 1, 4, 3, 6, 5, 8, 7, 0, 9));
		 
		System.out.println("Original Set: " + setNumbers);
		 
		Integer first = setNumbers.first();
		 
		System.out.println("First element: " + first);
		 
		Integer last = setNumbers.last();
		 
		System.out.println("Last element: " + last);
		 
		SortedSet<Integer> subSet = setNumbers.subSet(3, 7);
		 
		System.out.println("Sub Set: " + subSet);
		 
		SortedSet<Integer> headSet = setNumbers.headSet(5);
		 
		System.out.println("Head Set: " + headSet);
		 
		SortedSet<Integer> tailSet = setNumbers.tailSet(5);
		 
		System.out.println("Tail Set: " + tailSet);
	}
}
