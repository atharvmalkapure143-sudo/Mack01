package set;

import java.util.*;


//public class Badsha {
//	
//	public static void main(String[] args) {
//		Set<String>s=new HashSet<>(); 
//		System.out.println("Set Elements: "+s);
//	}
//
//}

//1.adding elements

//public class Badsha{
//	public static void main(String[] args) {
//		Set<String>t=new HashSet<String>();
//		
//		t.add("b");
//		t.add("b");
//		t.add("c");
//		t.add("a");
//		System.out.println(t);
//	}
//}


//2.accessing the elements


//public class Badsha{
//	public static void main(String[]args) {
//		
//		Set<String>a=new HashSet<String>();
//		a.add("A");
//		a.add("B");
//		a.add("C");
//		a.add("A");
//		System.out.println("Set is"+a);
//		String s="d";
//		System.out.println("Contains"+s+" "+ a.contains(s));
//	}
//}

//3.Removing Elements

//public class Badsha{
//	public static void main(String[] args) {
//		Set<String>a=new HashSet<String>();
//		a.add("a");
//		a.add("b");
//		a.add("c");
//		a.add("b");
//		a.add("d");
//		a.add("e");
//		
//		System.out.println("Inatial Hashset"+a);
//		a.remove("b");
//		System.out.println("After removing element "+a);
//	}
//}


//4.iterating elements
public class Badsha{
public static void main(String[] args) {
	
	Set<String>a= new HashSet<String>();
	
	a.add("a");
	a.add("b");
	a.add("c");
	a.add("b");
	a.add("d");
	a.add("e");
	
	for(String value: a) {
		System.out.println(value+" ,");
		System.out.println();
	}
	
	
}	
}
