package vector;

import java.util.Vector;
//1
//public class Faq {
//
//	public static void main(String[] args) {
//		Vector<String> v=new Vector<>();
//		v.add("A");
//		v.add("b");
//		v.add("c");
//		v.add("d");
//System.out.println(v);
//	}
//
//}



//2
//public class Faq{
//	public static void main(String [] args) {
//		Vector<Integer>V=new Vector<>(2);
//		System.out.println("Inatial capacity:"+V.capacity());
//		V.add(10);
//		V.add(20);
//		System.out.println("Capacity after adding @ elements:"+V.capacity());
//		V.add(30);
//		System.out.println("capacity after adding 3rd  elements"+V.capacity());
//		V.add(40);
//		V.add(50);
//		System.out.println("capacity after adding 5 elements"+V.capacity());
//	}
//}


//1.Adding

//public class Faq{
//	public static void main(String[] args) {
//		Vector v1= new Vector();
//		v1.add(1);
//		v1.add(2);
//		v1.add("geeks");
//		v1.add("forgeeks");
//		v1.add("3");
//		
//		System.out.println("Vector v1 is :"+v1);
//		Vector<Integer> v2 = new Vector<Integer>();
//		v2.add(1);
//		v2.add(2);
//		v2.add(3);
//		
//		System.out.println("Vector v2 is :"+v2);
//	}
//}
//updating
//public class Faq{
//	public static void main(String[] args) {
//		Vector<Integer> v2 = new Vector<Integer>();
//		v2.add(1);
//		v2.add(2);
//		v2.add(5);
//		v2.add(6);
//		v2.add(7);
//		
//		System.out.println("Vector v2 is :"+v2);
//		
//		System.out.println("Vector v2 is :"+v2.set(0, 21));
//		System.out.println("Vector v2 is :"+v2.set(4, 50));
//		System.out.println("The new Vector is :"+v2);
//		
//	}
//}
//removing
//public class Faq{
//	public static void main(String[] args) {
//		Vector<Integer> v2 = new Vector<Integer>();
//		v2.add(1);
//		v2.add(2);
//		v2.add(5);
//		v2.add(6);
//		v2.add(7);
//		
//		System.out.println("Vector v2 is :"+v2);
//		
//		v2.remove(1);
//		System.out.println("The new Vector remove is :"+v2);
//		
//	}
//}
//iterating vector

public class Faq{
	public static void main(String[] args) {
		Vector<String>V=new Vector<>();
		V.add("Mack");
		V.add("jack");
		V.add("pack");
		for(int i=0;i<V.size();i++) {
			System.out.println(V.get(i)+" ");
		}
		System.out.println();
		for(String str : V) {
			System.out.println(str+" ");
		}
	}
}




