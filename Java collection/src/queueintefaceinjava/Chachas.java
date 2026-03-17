package queueintefaceinjava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

//public class Chachas {
//  public static void main(String args[]) {
//	  
//	  Queue<Integer>y=new LinkedList<>();
//	  System.out.println("Queue elements: "+ y);
//	  
//  }
//
//}
//ex1
//public class Chachas{
//	public static void main(String[] args) {
//		Queue<String> queue= new LinkedList<>();
//		queue.add("apple");
//		queue.add("banana");
//		queue.add("cherry");
//		
//		System.out.println("Queue: "+queue);
//		
//		
//		
//		String front= queue.remove();
//		System.out.println("Removed element"+ front);
//		System.out.println("Queue after removal"+queue);
//		queue.add("date");
//		
//		String peeked=queue.peek();
//		System.out.println("Peeked element"+ peeked);
//		System.out.println("Queue after peeked"+queue);
//			
//	}
//}

//ex2

//public class Chachas{
//	public static void main(String[] args) {
//		
//		Queue<Integer>j=new LinkedList<>();
//		for( int i=0;i<5;i++) 
//			j.add(i);
//			System.out.println("Elements of queue :"+ j);
//			
//			int removedele=j.remove();
//			System.out.println("Removed element:"+ removedele);
//			System.out.println(j);
//			int head=j.peek();
//			System.out.println("Head queue element:"+head);
//			int size=j.size();
//			System.out.println("Size of queue "+ size);
//			
//		
//	}
//	}
//


//1.priority queue

//public class Chachas{
//	public static void main(String[] args) {
//		
//		Queue<Integer>w=new PriorityQueue<Integer>();
//		
//		w.add(10);
//		w.add(20);
//		w.add(15);
//		System.out.println(w.peek());
//		
//		System.out.println(w.poll());
//		
//		System.out.println(w.peek());
//		
//		
//		
//		
//	}
//	}

//2linked list


//public class Chachas{
//	public static void main(String[] args) {
//		 Queue<Integer>e=new LinkedList<Integer>();
//		 e.add(10);
//		 e.add(20);
//		 e.add(15);
//		 System.out.println(e.peek());
//		 System.out.println(e.poll());
//		 System.out.println(e.peek());
//		
//		
//		
//		
//		
//	}
//	
//	
//	}
//3.priority blockingqueue
//public class Chachas{
//	public static void main(String[] args) {
//		Queue<Integer>s= new PriorityBlockingQueue<Integer>();
//		
//		s.add(10);
//		s.add(20);
//		s.add(15);
//		System.out.println(s.peek());
//		System.out.println(s.poll());
//		System.out.println(s.peek());
//		
//	}
//	}

//1.adding element

//public class Chachas{
//	public static void main(String[] args) {
//	Queue<String>e=new PriorityQueue<>();
//	e.add("Geeks");
//	e.add("for");
//	e.add("Geeks");
//	System.out.println(e);
//	
//	
//	}
//	}
//removing elments

//public class Chachas{
//	public static void main(String[] args) {
//		 Queue<String>e=new PriorityQueue<>();
//		 e.add("geeks");
//		 e.add("for");
//		 e.add("geeks");
//		 
//		 System.out.println(e);
//		 e.remove("geeks");
//		 System.out.println("remove the e:"+ e);
//		 System.out.println("poll the method:"+ e.poll());
//		 System.out.println("final queue:"+ e);
//		 
//	}
//	}

//iterating the element
public class Chachas{
	public static void main(String[] args) {
		Queue<String>e=new PriorityQueue<>();
		e.add("geeks");
		e.add("for");
		e.add("geeks");
		
		Iterator iterator=e.iterator();
		
		while(iterator.hasNext()) {
          System.out.println(iterator.next()+"");
		}
		
	}
	}



