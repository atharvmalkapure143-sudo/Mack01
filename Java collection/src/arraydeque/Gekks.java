package arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

//public class Gekks {
//
//	public static void main(String[] args) {
//		
//		Deque<Integer>a= new ArrayDeque<>();
//		a.addFirst(1);
//		a.addLast(2);
//		
//		int f=a.removeFirst();
//		int l=a.removeLast();
//		
//		System.out.println("First: "+ f +" Last: "+l);
//		
//		
//	}
//
//}

//1.adding
//public class Gekks {
//
//	public static void main(String[] args) {
//		
//		Deque<String>a= new ArrayDeque<String>();
//		a.add("The");
//		a.addFirst("Mack");
//		a.addLast("Og");
//		
//		a.offer("For");
//		a.offerFirst("Welcome");
//		a.offerLast("Geeks");
//		
//		System.out.println("ArrayDeque :"+a);
//		
//		
//	}
//
//}
//2.accessing elements
//public class Gekks {
//	
//	public static void main(String[] args) {
//		
//		ArrayDeque<String>a= new ArrayDeque<String>();
//		a.add("Welcome");
//		a.add("To");
//		a.add("Mack");
//		a.add("For");
//		a.add("Mack");
//		
//		
//		System.out.println("ArrayDeque :"+a);
//		System.out.println("The First element is :"+a.getFirst());
//		System.out.println("The Last element is :"+a.getLast());
//		
//		
//	}
//	
//}
//3 removing elements

//public class Gekks {
//	
//	public static void main(String[] args) {
//		
//		ArrayDeque<String>a= new ArrayDeque<String>();
//		a.add("Welcome");
//		a.add("To");
//		a.add("Mack");
//		a.add("For");
//		a.add("Mack");
//		
//		
//		System.out.println("ArrayDeque :"+a);
//		System.out.println("The remove element pop is :"+a.pop());
//		System.out.println("The  element using poll() is :"+a.poll());
//		System.out.println("The first element is :"+a.pollFirst());
//		System.out.println("Final Deque ::"+a);
//		
//		
//	}
//	
//}


//4.Itereating Elements

public class Gekks{
	public static void main(String[] args) {
		
		Deque<String>d= new ArrayDeque<String>();
		d.add("For");
		d.addFirst("Geeks");
		d.addLast("Geeks");
		d.add("is so good");
		
		System.out.println("Iterating in ForwardOrder: ");
		for(Iterator i= d.iterator();i.hasNext();) {
			
			System.out.println(i.next()+" ");
			
		}
		System.out.println();
		System.out.println("Iterating in ReversedOrder: ");
		for(Iterator i= d.descendingIterator();i.hasNext();) {
			System.out.println(i.next()+" ");
		}
	}
}












