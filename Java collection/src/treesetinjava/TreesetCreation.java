package treesetinjava;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

//public class TreesetCreation {
//public static void main(String[] args) {
//	
//	
//	TreeSet<String>t= new TreeSet<>();
//	System.out.println("TreeSet elements:  "+t);
//}

//Adding elements
//public class TreesetCreation {
//	public static void main(String[] args) {
//		
//		
//		TreeSet<String>t= new TreeSet<>();
//		t.add("Mack");
//		t.add("jack");
//		t.add("pack");
//		System.out.println("TreeSet elements:  "+t);
//	}
//}

//accesing the element
//public class TreesetCreation {
//	public static void main(String[] args) {
//		
//		
//		TreeSet<String>t= new TreeSet<>();
//		t.add("Mack");
//		t.add("jack");
//		t.add("pack");
//		System.out.println("TreeSet elements:  "+t);
//		String check= "Mack";
//		System.out.println("Contains"+ check+" "+t.contains(check));
//		System.out.println("First value:: "+t.first());
//		System.out.println("last value:: "+t.last());
//		String val= "jack";
//		System.out.println("Higher::"+t.higher(val));
//		System.out.println("Lower::"+t.lower(val));
//	}
//}


//Removing the value


//public class TreesetCreation {
//	public static void main(String[] args) {
//	NavigableSet<String>U= new TreeSet<>();
//	U.add("Geek");
//	U.add("for");
//	U.add("Geeks");
//	U.add("A");
//	U.add("B");
//	U.add("Z");
//	System.out.println("Initial Treeset "+U);
//	U.remove("B");
//	System.out.println("After removing element "+U);
//	U.pollFirst();
//	System.out.println("After removing First "+U);
//	U.pollLast();
//	
//	System.out.println("After removing last "+U);
//		
//		}
//	}

//4

//iterating the Treeset


//   public class TreesetCreation {
//public static void main(String[] args) {
//	
//	Set<String>t=new TreeSet<>();
//	t.add("Geek");
//	t.add("For");
//	t.add("Geeks");
//	t.add("A");
//	t.add("B");
//	t.add("Z");
//	for (String value: t) {
//		System.out.println(value+ " , ");
//}
//	System.out.println();
//   }
//}
//5 
//Using Treeset with custom object

public class TreesetCreation {
	public static void main(String[] args) {
		
		Set<StringBuffer>ts= new TreeSet<>(new
				Comparator<StringBuffer>() {
			public int compare(StringBuffer sb1, StringBuffer sb2) {
				
				
				return sb1.toString().compareTo(sb2.toString());
				
			}
			
				});
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("K"));
		ts.add(new StringBuffer("9"));
		ts.add(new StringBuffer("b"));
		ts.add(new StringBuffer("z"));
		System.out.println(ts);

		}
}
	
