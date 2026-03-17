package linkedHashSetinjava;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;




//public class Voice {
//	
//	public static void main(String[] args) {
//		
//		LinkedHashSet<String>set= new LinkedHashSet<>();
//		
//		set.add("Apple");
//		set.add("Banana");
//		set.add("Cherry");
//		set.add("Apple");
//		System.out.println(""+ set);
//		
//	}
//	
//}

//adding
//public class Voice {
//	
//	public static void main(String[] args) {
//		
//		LinkedHashSet<String>set= new LinkedHashSet<String>();
//		
//		set.add("Apple");
//		set.add("Banana");
//		set.add("Cherry");
//		
//		System.out.println("LinkedHashSet: "+ set);
//		
//	}
//	
//}
//removing elements
//public class Voice {
//	
//	public static void main(String[] args) {
//		
//		LinkedHashSet<String>set= new LinkedHashSet<String>();
//		
//		set.add("Apple");
//		set.add("Banana");
//		set.add("Apple");
//		set.add("A");
//		set.add("B");
//		set.add("z");
//		
//		System.out.println("LinkedHashSet: "+ set);
//		set.remove("B");
//		System.out.println(" after removing LinkedHashSet: "+ set);
//		System.out.println(set.remove("Kp"));
//		
//	}
//	
//}
//3iterating through the linked hashset


public class Voice{
	public static void main(String[] args) {
		
		Set<String>y=new LinkedHashSet<>();
		y.add("Geek");
		y.add("for");
		y.add("Geeks");
		y.add("A");
		y.add("B");
		y.add("Z");
		Iterator itr=y.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" , ");
		}
		System.out.println();
		
		for(String s:y) {
			System.out.println(s+" ,");
		}
		System.out.println();
		
	}
}