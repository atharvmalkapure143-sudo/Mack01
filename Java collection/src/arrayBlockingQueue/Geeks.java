package arrayBlockingQueue;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

//public class Geeks {
//
//	public static void main(String[] args) throws InterruptedException{
//	ArrayBlockingQueue<Integer>q= new ArrayBlockingQueue<>(3);
//	
//	q.put(1);
//	q.put(2);
//	q.put(3);
//	
//	System.out.println("Queue after adding elements::"+q);
//
//	}
//
//}





//public class Geeks {
//
//	public static void main(String[] args) throws InterruptedException{
//	 int c=15;
//		ArrayBlockingQueue<Integer>q= new ArrayBlockingQueue<>(c);
//	
//	q.put(1);
//	q.put(2);
//	q.put(3);
//	
//	System.out.println("ArrayBlockingQueue after adding elements::"+q);
//
//	}
//
//}


//1 Adding elements

//public class Geeks {
//
//	public static void main(String[] args) {
//	 int c=15;
//		ArrayBlockingQueue<Integer>q= new ArrayBlockingQueue<>(c);
//	
//	q.add(100);
//	q.add(200);
//	q.add(300);
//	
//	System.out.println("ArrayBlockingQueue a::"+q);
//
//	}
//
//}

//removing elements

//public class Geeks {
//
//	public static void main(String[] args) {
//	 int c=15;
//		ArrayBlockingQueue<Integer>q= new ArrayBlockingQueue<>(c);
//	
//	q.add(100);
//	q.add(200);
//	q.add(300);
//	
//	System.out.println("ArrayBlockingQueue a::"+q);
//	 boolean b=q.remove(200);
//	 
//	 System.out.println("Element 2 removed ?: "+b);
//	 System.out.println("Updated  ArrayBlockingQueue : "+q);
//
//	}
//
//}



//3.Accessing elements

//public class Geeks {
//
//	public static void main(String[] args) {
//	 int c=15;
//		ArrayBlockingQueue<Integer>q= new ArrayBlockingQueue<>(c);
//	
//	q.add(100);
//	q.add(200);
//	q.add(300);
//	q.add(400);
//	
//	System.out.println("ArrayBlockingQueue ::"+q);
//	
//	 System.out.println("head of queue is: : "+q.peek());
//
//	}
//
//}

//4.iterating elements


public class Geeks {

	public static void main(String[] args) {
	 int c=15;
		ArrayBlockingQueue<String>q= new ArrayBlockingQueue<>(c);
	
	q.add("Java");
	q.add("C++");
	q.add("Python");
	q.add("Js");
	
	System.out.println("ArrayBlockingQueue ::"+q);
	
	 Iterator i=q.iterator();
	 System.out.println("The iterator values::");
	 while(i.hasNext()) {
		 System.out.println(i.next()+"");
	 }

	}

}
















