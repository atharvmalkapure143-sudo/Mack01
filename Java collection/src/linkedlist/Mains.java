package linkedlist;

import java.awt.SystemTray;
import java.util.LinkedList;

//public class Mains {
//
//	public static void main(String[] args) {
//		LinkedList<String>l=new LinkedList<String>();
//		l.add("One");
//		l.add("Two");
//		l.add("Three");
//		l.add("Four");
//		l.add("Five");
//		System.out.println(l);
//		
//
//	}
//
//}

//1.adding elements

//public class Mains{
//	public static void main(String [] args) {
//		LinkedList<String>li=new LinkedList<String>();
//		li.add("Mack");
//		li.add("Bhau");
//		li.add("Developer");
//		System.out.println("infosis work at nagpur"+li);
//	}
//}

//2.updating the elements

//public class Mains{
//	public static void main(String[] args) {
//		LinkedList<String>li= new LinkedList<String>();
//		li.add("Mack");
//		li.add("chacha");
//		System.out.println(li);
//		li.set(1, "Badsha");
//		System.out.println(li);
//		
//		
//	}
//}


//removing elements


//public  class Mains{
//	public static void main (String[] args) {
//		LinkedList<String>li=new LinkedList<>();
//		li.add("Kaka");
//		li.add("Mack");
//		li.add("Badsha");
//		li.add("kaku");
//		System.out.println(li);
//		li.remove(0);
//		li.remove(2);
//		System.out.println(li);
//	}
//}

//4.iterating aLinked list


public class Mains{
	public static void main(String[] args) {
		LinkedList<String>li=new LinkedList<>();
		li.add("MAck");
		li.add("jAck");
		li.add("pAck");
		for(int i=1;i<li.size();i++) {
			System.out.println(li.get(i)+"");
		}
		System.out.println();
		
		for(String str: li) {
			System.out.println(str+" ");
		}
	}
}
