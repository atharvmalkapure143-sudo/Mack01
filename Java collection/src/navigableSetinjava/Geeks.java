package navigableSetinjava;

import java.util.NavigableSet;
import java.util.TreeSet;







//public class Geeks {
//
//	public static void main(String[] args) {
//		NavigableSet<Integer>ns= new TreeSet<>();
//		ns.add(10);
//		ns.add(20);
//		ns.add(30);
//		ns.add(40);
//		ns.add(50);
//		System.out.println("Navigable set::"+ns);
//
//	}
//
//}
//1.add elements
//public class Geeks {
//
//	public static void main(String[] args) {
//		NavigableSet<String>ns= new TreeSet<>();
//		ns.add("A");
//		ns.add("B");
//		ns.add("C");
//		ns.add("A");
//	
//		
//		System.out.println(ns);
//
//	}
//
//}

//Accesing elements
//public class Geeks {
//	
//	public static void main(String[] args) {
//		NavigableSet<String>ns= new TreeSet<>();
//		ns.add("A");
//		ns.add("B");
//		ns.add("C");
//		ns.add("A");
//		
//		
//		System.out.println(ns);
//		
//		String s="D";
//		
//		System.out.println("D exists in the navigableSt ?:: "+
//		ns.contains(s));
//		System.out.println("First element of navigableSet::"+ns.first());
//		System.out.println("last element of navigableSet::"+ns.last());
//	
//
//		
//		
//		
//	}
//	
//}

//removing elements
//public class Geeks {
//	
//	public static void main(String[] args) {
//		NavigableSet<String>ns= new TreeSet<>();
//		ns.add("A");
//		ns.add("B");
//		ns.add("C");
//		ns.add("B");
//		ns.add("D");
//		ns.add("E");
//		
//		
//		System.out.println(ns);
//		
//		ns.remove("B");
//		
//		System.out.println("AAfter removing elements"+ns);
//		ns.pollFirst();
//		System.out.println(" after the removal first element"+ns);
//		ns.pollLast();
//		System.out.println("after removal the last elemnt"+ ns);
//	
//	
//		
//		
//		
//		
//		
//	}
//	
//}
//iterator
public class Geeks {
	
	public static void main(String[] args) {
		NavigableSet<String>ns= new TreeSet<>();
		ns.add("A");
		ns.add("B");
		ns.add("C");
		ns.add("Y");
		ns.add("D");
		ns.add("Z");
		
		for (String i: ns)
		System.out.println(i+" ,");
		
		
		
		
		
	}}