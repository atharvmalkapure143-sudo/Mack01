package coreinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
// adding the elements to a
//collection
//public class Collectioninterface {
//	public static void main(String [] args) {
//		Collection<Integer> l1= new ArrayList<>(5);
//		l1.add(15); 
//		l1.add(20); 
//		l1.add(25);
//		
//		for(Integer n: l1) {
//			System.out.println("Number ="+ n);
//			
//		}
//		Collection<Integer> l2= new ArrayList<>();
//		l2.addAll(l1);
//		System.out.println("The new ArrayList is:"+l2);
//	}
//
//}
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;






//2.removing elements from a collection

//public  class Collectioninterface{
//	public static void main(String [] args) {
//	Collection<Integer>l1= new HashSet<>(Arrays.asList(1,2,3,4,5));
//	System.out.println("Initial set:"+ l1);
//	l1.remove(4);
//	System.out.println("Set after removing 4:"+l1);
//	Collection<Integer>l2=new HashSet<>(Arrays.asList(1,2,3));
//	l1.removeAll(l2);
//	
//	System.out.println("Set after removeAll():"+ l1);
//	
//	
//	
//	}
//}
//3 Iterator over a collection

public class Collectioninterface{
	
	public static void main(String[] args) {
		
		Collection<String> l= new LinkedList<>();
		l.add("Mack");
		l.add("for");
		l.add("Mack");
		System.out.println("The list is :"+l);
		
		Iterator<String>it= l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
		
	}
	
	
}







