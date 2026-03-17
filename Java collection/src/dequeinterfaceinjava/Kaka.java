package dequeinterfaceinjava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;




//public class Kaka {
//	public static void main(String[] args) {
//
//	Deque<String> d= new ArrayDeque<>(); 
//	d.addFirst("1");
//	d.addLast("2");
//	
//	String f = d.removeFirst();
//	String l = d.removeLast();
//	System.out.println("First: "+f+",Last:"+l);
//	}
//}

//creating deque object

//public class Kaka{
//	public static void main(String[] args) {
//		Deque<String>deque= new LinkedList<String>();
//		deque.add("Element 1(Tail)");
//		deque.addFirst("Element 2(Head)");
//		deque.addLast("Element 3(Tail)");
//		deque.push("Element 4(Head)");
//		deque.offer("Element 5(Tail)");
//		deque.offerFirst("Element 6(Head)");
//		
//		System.out.println(deque+"\n");
//		deque.removeFirst();
//		deque.removeLast();
//		System.out.println("Deque after removing "+"first and last :"+ deque);
//	}
//}

//1.adding elements


//public class Kaka{
//	public static void main(String[] args) {
//		
//		Deque<String>dq=new ArrayDeque<>();
//		
//		dq.add("For");
//		dq.addFirst("Geeks");
//		dq.addLast("Geeks");
//		System.out.println(dq);
//		
//	}
//}


//2.Removing Element

//public class Kaka{
//	public static void main(String[] args) {
//		Deque<String>dq= new ArrayDeque<>();
//		dq.add("for");
//		dq.addFirst("Mack");
//		dq.addLast("Gekks");
//		System.out.println(dq);
//		System.out.println(dq.pop());
//		System.out.println(dq.poll());
//		System.out.println(dq.pollFirst());
//		System.out.println(dq.pollLast());
//	}
//}

//3.iterating through the deque

//public class Kaka{
//	public static void main(String[] args) {
//		Deque<String>dqDeque=new ArrayDeque<>();
//		dqDeque.add("for");
//		dqDeque.addFirst("Mack");
//		dqDeque.addLast("geeks");
//		dqDeque.add("is so good");
//		for(Iterator itr=dqDeque.iterator();itr.hasNext();) {
//			System.out.println(itr.next()+"");
//		}
//		System.out.println();
//		for (Iterator itrIterator=dqDeque.descendingIterator();itrIterator.hasNext();) {
//			System.out.println(itrIterator.next()+" ");
//		}
//	}
//}

//Array dequeue

//public class Kaka{
//	public static void main(String []args) {
//		Deque<Integer>dq=new ArrayDeque<Integer>(10);
//		dq.add(10);
//		dq.add(20);
//		dq.add(30);
//		dq.add(40);
//		dq.add(50);
//		System.out.println(dq);
//		dq.clear();
//		dq.addFirst(564);
//		dq.addFirst(291);
//		dq.addLast(14);
//		dq.addLast(24);
//
//		System.out.println(dq);
//	}
//}
