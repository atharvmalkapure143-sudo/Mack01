package listiterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//public class Chacha {
//
//	public static void main(String[] args) {
//		List<String>names= new LinkedList<>();
//		names.add("Welcome");
//		names.add("To");
//		names.add("Ytl");
//		
//		ListIterator<String>namesIterator=names.listIterator();
//		while(namesIterator.hasNext()) {
//			
//			System.out.println(namesIterator.next());
//		}
//		
//		for(String s: names) {
//			
//			System.out.println(s);
//		}
//		
//
//	}
//
//}



public class Chacha {

	public static void main(String[] args) {
		List<String>names= new LinkedList<>();
		names.add("Welcome");
		names.add("To");
		names.add("Ytl");
		
		ListIterator<String>namesIterator=names.listIterator();
		
		System.out.println("Forward Direction Iteration::");
		while(namesIterator.hasNext()) {
			
			System.out.println(namesIterator.next());
		}
		System.out.println("Backward Direction Iteration::");
		while(namesIterator.hasPrevious()) {
			
			System.out.println(namesIterator.previous());
		}
		
		
	}

}