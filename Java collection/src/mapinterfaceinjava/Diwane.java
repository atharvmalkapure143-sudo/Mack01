package mapinterfaceinjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;






//public class Diwane {
//	public static void main(String[] args) {
//		
//		Map<String,Integer>m=new HashMap<>();
//		m.put("Geek1", 1);
//		m.put("Geek2", 2);
//		m.put("Geek3", 3);
//		System.out.println(m);
//		
//	}
//
//}

//public class Diwane{
//	public static void main(String[] args) {
//		Map<String,Integer>m=new HashMap<String,Integer>();
//		m.put("a", new Integer(100));
//		m.put("b", new Integer(200));
//		m.put("c", new Integer(300));
//		m.put("d", new Integer(400));
//	
//		
//		for(Map.Entry<String, Integer>me : m.entrySet()) {
//			System.out.println(me.getKey()+":");
//			System.out.println(me.getValue());
//		}
//	}
//}

//1.adding elements

//public class Diwane{
//	public static void main(String[] args) {
//		Map<Integer, String>hm1=new HashMap<>();
//		Map<Integer,String >hm2=new HashMap<Integer,String>();
//		hm1.put(1, "Geeks");
//		hm1.put(2, "for");
//		hm1.put(3, "Geeks");
//		hm2.put(1, "Geeks");
//		hm2.put(2, "for");
//		hm2.put(3, "Geeks");
//		System.out.println(hm1);
//		System.out.println(hm2);
//	}
//}

//2.Changing Element



/*
 * public class Diwane{ public static void main(String [] args) { Map<Integer,
 * String>hm1= new HashMap<Integer,String>();
 * 
 * hm1.put(new Integer(1), "Geeks"); hm1.put(new Integer(2), "Geeks");
 * hm1.put(new Integer(3), "Geeks"); System.out.println("Initial map:"+hm1);
 * hm1.put(new Integer(2), "for"); System.out.println("Updated Map:"+hm1); } }
 */




//Removing elements
//public class Diwane{
//	public static void main(String[] args) {
//		Map<Integer, String>hm1=
//				new HashMap<Integer,String>();
//		hm1.put(new Integer(1), "Geeks");
//		hm1.put(new Integer(2), "for");
//		hm1.put(new Integer(3), "Geeks");
//		hm1.put(new Integer(4), "for");
//		
//		System.out.println(hm1);
//		hm1.remove(new Integer(4));
//		
//		System.out.println(hm1);
//		
//	}
//}

//4.iterating the map

//public class Diwane{
//	public static void main(String[] args) {
//		Map<Integer, String>hm1=
//				new HashMap<Integer,String>();
//		
//		hm1.put(new Integer(1), "Geeks");
//		hm1.put(new Integer(2), "for");
//		hm1.put(new Integer(3), "Geeks");
//		for(Map.Entry mapElement: hm1.entrySet()) {
//			int key=(int)mapElement.getKey();
//			
//			String value= (String)mapElement.getValue();
//			
//			System.out.println(key+" : "+value);
//		}
//	}
//}



public class Diwane{
	public static void main(String[] args) {
		int a[]= { 1,13,4,1,41,31,31,4,13,2};
		ArrayList<Integer>a1=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			a1.add(a[i]);
			
		}
		HashMap<Integer, Integer>hm= new HashMap<>();
		
		for(int i=0;i<a1.size();i++) {
			hm.putIfAbsent(a1.get(i), Collections.frequency(a1,a1.get(i)));
		}
		System.out.println(hm);
}
}









