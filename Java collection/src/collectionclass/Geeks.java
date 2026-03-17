package collectionclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//public class Geeks {

//	public static void main(String[] args) {
//		ArrayList<String>a1= new ArrayList<>();
//		
//		a1.add("Apple");
//		a1.add("Bananna");
//		a1.add("Apple");
//		System.out.println(""+a1);
//		
//
//	}
//
//}
	//1adding 
//	public static void main(String[] args) {
//		List<String>a1= new ArrayList<>();
//		
//		a1.add("Apple");
//		a1.add("Bananna");
//		Collections.addAll(a1,"Fruits","Bat","Ball");
//		for(int i=0; i<a1.size();i++) {
//		System.out.println(a1.get(i)+"");
//		
//		}
//
//	}
//
//}
	
//	2Sorting
//	public static void main(String[] args) {
//		List<String>a1= new ArrayList<>();
//		
//		a1.add("Apple");
//		a1.add("Bananna");
//		Collections.addAll(a1,"Fruits","Bat","Ball");
//		Collections.sort(a1);
//		for(int i=0; i<a1.size();i++) {
//		System.out.println(a1.get(i)+"");
//		
//		}
//		System.out.println();
//		Collections.sort(a1,Collections.reverseOrder());
//		for(int i=0; i<a1.size();i++) {
//			System.out.println(a1.get(i)+"");
//			
//			}
//
//	}
//
//}

	//searching elements
//	public class Geeks{
//	public static void main(String[] args) {
//		List<String>a1= new ArrayList<>();
//		
//		a1.add("Apple");
//		a1.add("Bananna");
//		a1.add("Grapes");
//		a1.add("Watermelon");
//		a1.add("Guva");
//		
//		Collections.sort(a1);
//		
//		System.out.println("The index of fruits is::"+Collections.binarySearch(a1, "Guva"));
//		System.out.println("The index of fruits is::"+Collections.binarySearch(a1, "Grapes"));
//			
//
//		}
//
//
//	}


//4 copy
//public class Geeks{
//public static void main(String[] args) {
//	List<String>a1= new ArrayList<>();
//	
//	a1.add("Apple");
//	a1.add("Bananna");
//	a1.add("Grapes");
//	a1.add("Guva");
//	a1.add("Watermelon");
//	System.out.println("The orignal Destination list is::");
//	for(int i=0; i<a1.size();i++) {
//	System.out.println(a1.get(i)+"");
//	
//	}
//	System.out.println();
//	System.out.println("*==========================*");
//	
//	List<String>a12=new ArrayList<>();
//	a12.add("Bat");
//	a12.add("Ball");
//	a12.add("Pecock");
//	Collections.copy(a1, a12);
//	System.out.println("The Destination List After copying is::");
//	for(int i=0; i<a1.size();i++) {
//		System.out.println(a1.get(i)+"");
//		
//		}
//	System.out.println("*==========================*");
//}
//
//}


//Disjoint collection

public class Geeks{
public static void main(String[] args) {
	List<String>a1= new ArrayList<>();
	
	a1.add("Apple");
	a1.add("Bananna");
	a1.add("Grapes");
	a1.add("Guva");
	a1.add("Watermelon");
	
	
	List<String>a12=new ArrayList<>();
	a12.add("Bat");
	a12.add("Ball");
	a12.add("Pecock");
	
	System.out.println(Collections.disjoint(a1, a12));
	
	System.out.println("*==========================*");
}



}









