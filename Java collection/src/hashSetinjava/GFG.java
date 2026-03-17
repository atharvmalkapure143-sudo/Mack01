package hashSetinjava;

import java.util.HashSet;
import java.util.Iterator;

//public class GFG {
//
//	public static void main(String[] args) {
//		HashSet<Integer>hSet=new HashSet<>();
//		hSet.add(1);
//		hSet.add(2);
//		hSet.add(1);
//		System.out.println("HashSet size: "+hSet.size());
//		System.out.println("Elements in Hashset: "+hSet);
//
//	}
//
//}

//1.adding elements

//public class GFG{
//	public static void main(String[] args)
//	{
//		HashSet<String> hs= new HashSet<String>();
//		
//		hs.add("Geek");
//		hs.add("For");
//		hs.add("Geeks");
//		System.out.println("HashSet:"+hs);
//	}
//}
// removing the elements
//public class GFG{
//	public static void main(String[] args)
//	{
//		HashSet<String> hs= new HashSet<String>();
//		
//		hs.add("Geek");
//		hs.add("For");
//		hs.add("Geeks");
//		hs.add("A");
//		hs.add("B");
//		hs.add("Z");
//		System.out.println("HashSet:"+hs);
//		hs.remove("B");
//		System.out.println("HashSet after removing element : "+hs);
//		System.out.println("B exists in Set : "+hs.remove("B"));
//	}
//}

//iterating through the Hashset

public class GFG{
	public static void main(String[] args) {
		HashSet<String>hs= new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("Geeks");
		hs.add("For");
		hs.add("Geeks");
		hs.add("Z");
		System.out.println("Using iterator : ");
		Iterator<String>iterator =hs.iterator();
		while(iterator.hasNext()) 
			System.out.println(iterator.next()+" , ");
		
		System.out.println();
	
		System.out.println("Using enhanced for loop: ");
		for(String element :hs)
			System.out.println(element+" , ");
		
		
			
		
	}
}