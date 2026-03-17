package arraylistinjava;

import java.util.ArrayList;

//public class Main {
//
//	public static void main(String[] args) {
//		ArrayList<Integer>a=new ArrayList<Integer>();
//		a.add(100);
//		a.add(200);
//		a.add(300);
//		System.out.println(a);
//
//	}
//
//}


public class Main{
	public static void main(String [] args) {
		ArrayList<String>a=new ArrayList<>();
		a.add("Mack");
		a.add("jack");
		System.out.println("Orignal list:"+a);
		a.add(1,"Pack");
		System.out.println("After elements adding for index 1 :"+a);
		
		a.remove(0);
		System.out.println("Elements removing index 0:"+a);
		a.set(0, "bony");
		System.out.println("List of updatation value:"+a);
	}
}
