package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

//public class Geeks {
//
//	public static void main(String[] args) {
//		LinkedHashMap<String, Integer>M= new LinkedHashMap<>();
//		M.put("Apple", 50);
//		M.put("Banana", 30);
//		M.put("Mango", 70);
//		M.put("Orange", 40);
//		
//		System.out.println("LinkedHashMap: "+ M);
//		
//
//	}
//
//}
//1. adding elements
//public class Geeks {
//
//	public static void main(String[] args) {
//		LinkedHashMap<Integer, String>M= new LinkedHashMap<Integer,String>();
//		M.put(3,"Geeks");
//		M.put(2,"For");
//		M.put(3,"Geeks");
//		
//		
//		System.out.println("LinkedHashMap: "+ M);
//		
//
//	}
//
//}

//2Updating Elements

//public class Geeks {
//
//	public static void main(String[] args) {
//		LinkedHashMap<Integer, String>M= new LinkedHashMap<Integer,String>();
//		M.put(3,"Geeks");
//		M.put(2,"Geeks");
//		M.put(1,"Geeks");
//		
//		
//		System.out.println("LinkedHashMap: "+ M);
//		M.put(2, "For");
//		System.out.println("LinkedHashMap: "+ M);
//		
//
//	}
//
//}

//3.removing element

//public class Geeks {
//
//	public static void main(String[] args) {
//		LinkedHashMap<Integer, String>M= new LinkedHashMap<Integer,String>();
//		M.put(3,"Geeks");
//		M.put(2,"Geeks");
//		M.put(1,"Geeks");
//		M.put(4,"For");
//		
//		
//		System.out.println("LinkedHashMap: "+ M);
//		M.remove(4);
//		System.out.println("LinkedHashMap remove: "+ M);
//		
//
//	}
//
//}
//4.iterating LinkedHashMap

public class Geeks {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String>M= new LinkedHashMap<Integer,String>();
		M.put(3,"Geeks");
		M.put(2,"For");
		M.put(1,"Geeks");
		
		
		for(Map.Entry<Integer, String>mapElemnt:M.entrySet()) {
			Integer k= mapElemnt.getKey();
			
			String v= mapElemnt.getValue();
			
			System.out.println(k+" : "+v);
		}
			
	
		

	}

}


