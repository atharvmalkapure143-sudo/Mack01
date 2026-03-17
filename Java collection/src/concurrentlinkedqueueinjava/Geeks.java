package concurrentlinkedqueueinjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;



//public class Geeks {
//
//	public static void main(String[] args) {
//	 ConcurrentLinkedQueue<Integer>queue=new ConcurrentLinkedQueue<>();
//	 
//	 queue.offer(1);
//	 queue.offer(2);
//	 queue.offer(3);
//	 System.out.println("Queue after adding elements: "+queue);
//			
//
//	}
//
//}

//public class Geeks {
//	
//	public static void main(String[] args) {
//		ConcurrentLinkedQueue<Integer>queue=new ConcurrentLinkedQueue<>();
//		
//		queue.offer(10);
//		queue.offer(20);
//		queue.offer(30);
//		queue.offer(40);
//		System.out.println("ConcurrentLinkedQueue: "+queue);
//		
//		ConcurrentLinkedQueue<Integer>q1=new ConcurrentLinkedQueue<Integer>(queue);
//		
//		System.out.println("ConcurrentLinkedqueue1: "+q1);
//	}
//	


//	public class Geeks {
//		
//		public static void main(String[] args) {
//			ConcurrentLinkedQueue<Integer>queue=new ConcurrentLinkedQueue<>();
//			
//			queue.offer(10);
//			queue.offer(20);
//			queue.offer(30);
//			queue.offer(40);
//			System.out.println("ConcurrentLinkedQueue: "+queue);
//			
//	;
//			
//			System.out.println("First element:: "+queue.peek());
//			System.out.println("First Head element:: "+queue.poll());
//			System.out.println("ConCurrentLinked Queue:: "+queue);
//			System.out.println("Size::" + queue.size());
//		}
//		
//}


//add
//public class Geeks{
//	public static void main(String[] args) {
//		ConcurrentLinkedQueue<String>q=new ConcurrentLinkedQueue<String>();
//		q.add("Java");
//		q.add("C++");
//		q.add("Python");
//		q.add("Js");
//		System.out.println("ConcurrentLinkedQueue: "+q);
//		
//		
//		ArrayList<String>q1= new ArrayList<>();
//		q1.add("Mack1");
//		q1.add("Mack2");
//		q1.add("Mack3");
//		q1.add("Mack4");
//		q1.add("Mack5");
//		
//		System.out.println("Collection added::"+q1);
//		boolean b= q.addAll(q1);
//		
//		System.out.println("Collectin added:: "+b);
//		
//		System.out.println("ConcurrentLinkedQuueue::"+q);
//				
//		
//	}
//}


//2.removing elements

//public class Geeks{
//	public static void main(String[] args) {
//		ConcurrentLinkedQueue<Integer>q= new ConcurrentLinkedQueue<Integer>();
//		
//		q.add(10);
//		q.add(20);
//		q.add(30);
//		q.add(40);
//		
//		System.out.println("ConcurrentLinkedQueue::"+q);
//		
//		boolean b=q.remove(20);
//		System.out.println("number 20 remove successfully? :"+b);
//		System.out.println("Updated ConcurrentLinkedQueue"+q);
//	}
//}
// iterating elements

//public class Geeks{
//	public static void main(String[] args) {
//		ConcurrentLinkedQueue<String> q= new ConcurrentLinkedQueue<>();
//		
//		q.add("Java");
//		q.add("C++");
//		q.add("Python");
//		q.add("JS");
//		System.out.println("COncurrentLinkedQueue::"+q);
//		Iterator i= q.iterator();
//		System.out.println("The string values of iterator are:");
//		while(i.hasNext()) {
//			System.out.println(i.next()+" ");
//		}
//	}
//}



//4.accessing elements

public class Geeks{
	public static void main(String[] args) {
		
		ConcurrentLinkedQueue<Integer>q= new ConcurrentLinkedQueue<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println("QUEUE::"+q);
		System.out.println("QUEUE head::"+q.element());
		System.out.println("QUEUE peek::"+q.peek());
		
	}
}



















