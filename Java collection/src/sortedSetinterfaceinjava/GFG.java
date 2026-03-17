package sortedSetinterfaceinjava;

import java.util.SortedSet;
import java.util.TreeSet;

//public class GFG {
//
//	public static void main(String[] args) {
//		SortedSet<Integer>set =new TreeSet<>();
//
//		set.add(50);
//		set.add(100);
//		set.add(40);
//		set.add(30);
//		set.add(90);
//		
//		System.out.println(set);
//		System.out.println("First element:: "+set.first());
//		System.out.println("last element:: "+set.last());
//	}
//
//}
//1addding element

//public class  GFG{
//	public static void main(String [] args) {
//		SortedSet<String>ts= new TreeSet<>();
//		ts.add("A");
//		ts.add("B");
//		ts.add("C");
//		ts.add("A");
//		System.out.println(ts);
//	}
//}

//accesing the elements

//public class  GFG{
//	public static void main(String [] args) {
//		SortedSet<String>ts= new TreeSet<String>();
//		ts.add("A");
//		ts.add("B");
//		ts.add("C");
//		ts.add("A");
//		System.out.println( "Sorted set is:"+ts);
//		String check="D";
//		System.out.println("Contains: "+check+" "+ts.contains(check));
//		System.out.println("First value:: "+ ts.first());
//		System.out.println("last value:: "+ ts.last());
//		
//	}
//}

//removing the values
//public class  GFG{
//	public static void main(String [] args) {
//		SortedSet<String>ts= new TreeSet<String>();
//		ts.add("A");
//		ts.add("B");
//		ts.add("C");
//		ts.add("B");
//		ts.add("D");
//		ts.add("E");
//		System.out.println( "Inatial set is:"+ts);
//		ts.remove("B");
//	
//		System.out.println("Aftere removing element"+ ts);
//		
//	}
//}
//iterating throgh the sortedset
public class  GFG{
	public static void main(String [] args) {
		SortedSet<String>ts= new TreeSet<String>();
		ts.add("K");
		ts.add("B");
		ts.add("C");
		ts.add("a");
		ts.add("D");
		ts.add("E");
		for(String value: ts) {
		System.out.println( value+", ");
		}
		
		System.out.println();
		
	}
}