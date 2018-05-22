package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(new Student(101,"A",24));
		a1.add(new Student(102,"B",25));
		a1.add(new Student(103,"C",26));
		System.out.println("Sorting By Name");
		
		Collections.sort(a1,new NameComparator());
		Iterator itr=a1.iterator();
		
		
		
	}

}
