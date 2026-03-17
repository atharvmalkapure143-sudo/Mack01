package enumerationinterfacinjava;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

//public class Badsheee {
//
//	public static void main(String[] args) {
//		Vector<String>fruits= new Vector<>();
//		fruits.add("Strraberry");
//		fruits.add("Watermelon");
//		fruits.add("Guva");
//		Enumeration<String>e= fruits.elements();
//		System.out.println("Elements of vector::");
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
//
//	}
//
//}




public class Badsheee {

	public static void main(String[] args) {
		Hashtable<Integer,String>fruits= new Hashtable<>();
		fruits.put(1,"Strraberry");
		fruits.put(2,"Watermelon");
		fruits.put(3,"Guva");
		Enumeration<Integer>e= fruits.keys();
		System.out.println("Hashtable Keys::");
		while(e.hasMoreElements()) {
			int key =e.nextElement();
			System.out.println(key+"->"+fruits.get(key));
		}

	}

}
