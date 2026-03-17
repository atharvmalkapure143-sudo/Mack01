package priorityQueueinjava;

import java.util.Iterator;
import java.util.PriorityQueue;

//public class Geeks {
//
//	public static void main(String[] args) {
//		PriorityQueue<Integer>p= new PriorityQueue<>();
//		p.add(3);
//		p.add(10);
//		p.add(7);
//		p.add(2);
//		System.out.println("Head of Queue:  "+p.peek());
//		
//
//	}
//
//}
//1.adding
//public class Geeks{
//	public static void main(String[] args) {
//		PriorityQueue<Integer>pq=new PriorityQueue<>();
//		for(int i=0;i<3;i++) {
//			pq.add(i);
//			pq.add(1);
//			
//		}
//		System.out.println(pq);
//	}
//	
//}

//2.removing elements

//public class Geeks{
//	public static void main(String[] args) {
//		PriorityQueue<String>pq=new PriorityQueue<>();
//		pq.add("Geeks");
//		pq.add("For");
//		pq.add("Geeks");
//		System.out.println("Initially PriorityQueue :"+pq);
//		pq.remove("Geeks");
//		System.out.println("After Remove :"+pq);
//		
//		System.out.println("poll method :"+pq.poll());
//		System.out.println("Final PriorityQueue: :"+pq);
//	}
//}
//Accesing
//public class Geeks{
//	public static void main(String[] args) {
//		PriorityQueue<String>pq=new PriorityQueue<>();
//		pq.add("Geeks");
//		pq.add("For");
//		pq.add("Geeks");
//		System.out.println(" PriorityQueue :"+pq);
//		String element=pq.peek();
//		System.out.println(" Accessed element :"+element);
//		
//	
//	}
//}

//4.iterating the PriorityQueue
public class Geeks{
	public static void main(String[] args) {
		PriorityQueue<String>pq=new PriorityQueue<>();
		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");
		Iterator iterator=pq.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
		
		
	}
}