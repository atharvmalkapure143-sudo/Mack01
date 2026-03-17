package concurrentskiplistinjava;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

//public class Geeks {
//	public static void main(String[] args) {
//		
//		ConcurrentSkipListSet<Integer>s=new ConcurrentSkipListSet<>();
//		s.add(10);
//		s.add(20);
//		s.add(30);
//		
//		System.out.println("Set: "+s);
//	}
//
//}
//1
//public class Geeks {
//	public static void main(String[] args) {
//		
//		ConcurrentSkipListSet<Integer>s=new ConcurrentSkipListSet<Integer>();
//		s.add(78);
//		s.add(64);
//		s.add(12);
//		s.add(45);
//		s.add(8);
//		
//		System.out.println("Set: "+s);
//		ConcurrentSkipListSet<Integer>s1=new ConcurrentSkipListSet<Integer>(s);
//		
//	System.out.println("ConcurrentSkipListSet1:  "+s1);
//	ConcurrentSkipListSet<String>s2=new ConcurrentSkipListSet<>();
//	
//	s2.add("Java");
//	s2.add("C++");
//	s2.add("Python");
//	s2.add("Java");
//	Iterator i=s2.iterator();
//	
//	System.out.println("ProgrammingSet1:  ");
//	while(i.hasNext()) {
//		System.out.println(i.next()+" ");
//	}
//	}
//
//}
//2

public class Geeks {
	public static void main(String[] args) {
		
		ConcurrentSkipListSet<Integer>s=new ConcurrentSkipListSet<>();
		s.add(78);
		s.add(64);
		s.add(12);
		s.add(45);
		s.add(8);
		
		System.out.println("Set: "+s);
		System.out.println("The highest element of set : "+s.last());
		System.out.println("The First element of set : "+s.pollFirst());
		
		if(s.contains(9)) {
			System.out.println("9 is present in the set.");
		}
		else {
			System.out.println("9 is not present in the set.");
		}
		
		System.out.println("Number of elements in the set= "+s.size());
		
	}

}
