package abstractqueueinjava;

import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

//public class Main {
//
//	public static void main(String[] args) {
//		AbstractQueue<Integer>a= new LinkedBlockingQueue<Integer>();
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		System.out.println("AbstractQueue :"+a);
//
//	}
//
//}

//public class Main {
//
//	public static void main(String[] args) {
//		AbstractQueue<Integer>a= new LinkedBlockingQueue<Integer>();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		a.add(50);
//		
//		System.out.println("AbstractQueue :"+a);
//
//	}
//
//}


//1 adding elements

//public class Main {
//
//	public static void main(String[] args) {
//		AbstractQueue<Integer>a= new LinkedBlockingQueue<Integer>();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		a.add(50);
//		
//		System.out.println("AbstractQueue :"+a);
//		
//		
//		AbstractQueue<Integer>b=new LinkedBlockingQueue<Integer>();
//		
//		System.out.println("AbstractQueue2 initially contains: "+ b.addAll(a));
//		System.out.println("AbstractQueue1 after addition contains : "+ b);
//		
//
//	}
//
//}
//2.remove elemrents
//public class Main {
//
//	public static void main(String[] args) {
//		AbstractQueue<Integer>a= new LinkedBlockingQueue<Integer>();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		a.add(50);
//		
//		System.out.println("AbstractQueue :"+a);
//		int head=a.remove();
//		
//		System.out.println("head:: "+head);
//		System.out.println("AbstractQueue1 after removal of head:"+a);
//		a.clear();
//		System.out.println("AbstractQueue1: "+a);
//
//	}
//
//}

//3.Accesing the elements

//public class Main {
//
//	public static void main(String[] args) {
//		AbstractQueue<Integer>a= new LinkedBlockingQueue<Integer>();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		a.add(50);
//		
//		System.out.println("AbstractQueue contains:"+a);
//		System.out.println("head:"+a.element());
//
//	}
//
//}
public class Main {

	public static void main(String[] args) {
		Queue<String>a= new LinkedList<>();
		
		a.add("ALICe");
		a.add("Bpb");
		a.add("CHarlie");
		a.add("David");
		
		
		System.out.println("Queue :"+a);
		
		String first= a.remove();
		System.out.println("Removed elrmant::"+ first);
		
		System.out.println("Queue::"+ a);
		
		String peeked= a.remove();
		System.out.println("Peeked elrmant::"+ peeked);
		System.out.println("QUEUe::"+ a);

	}

}













