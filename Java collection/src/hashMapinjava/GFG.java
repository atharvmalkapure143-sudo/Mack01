package hashMapinjava;

import java.util.HashMap;
import java.util.Map;




//public class GFG {
//
//	public static void main(String[] args) {
//		HashMap<String, Integer>hashMap= new HashMap<>();
//		hashMap.put("John", 25);
//		hashMap.put("Jane", 30);
//		hashMap.put("Jim", 35);
//		
//		for(Map.Entry<String, Integer>entry : hashMap.entrySet()) {
//			System.out.println(entry.getKey()+"->"+entry.getValue());
//		}
//
//	}
//
//}
//1.adding elements
//public class GFG {
//	
//	public static void main(String[] args) {
//		HashMap<String, Integer>hashMap= new HashMap<>();
//		HashMap<String, Integer>hashMap2= new HashMap<>();
//		hashMap.put("John", 25);
//		hashMap.put("Jane", 30);
//		hashMap.put("Jim", 35);
//		
//		hashMap2.put("John", 25);
//		hashMap2.put("Jane", 30);
//		hashMap2.put("Jim", 35);
//		
//		System.out.println("Mappings of HashMap hm1 are :"+hashMap);
//		System.out.println("Mappings of HashMap hm2 are :"+hashMap2);
//		
//	}
//	
//}
//2.changing elements
//public class GFG {
//	
//	public static void main(String[] args) {
//		HashMap<Integer, String>hashMap= new HashMap<Integer,String>();
//	
//		hashMap.put(1, "John");
//		hashMap.put(2, "John");
//		hashMap.put(3, "John");
//		
//
//		
//		System.out.println("Mappings of HashMap hm1 are :"+hashMap);
//		hashMap.put(2,"For");
//		
//		System.out.println("Mappings of HashMap Updated are :"+hashMap);
//		
//	}
//	
//}

//3.removing elemnts
//public class GFG {
//	
//	public static void main(String[] args) {
//		HashMap<Integer, String>hashMap= new HashMap<Integer,String>();
//		
//		hashMap.put(1, "John");
//		hashMap.put(2, "Badsha");
//		hashMap.put(3, "Lamine");
//		
//		
//		
//		System.out.println("Mappings of HashMap hm1 are :"+hashMap);
//		hashMap.remove(2);
//		
//		System.out.println("Mappings of HashMap Removal are :"+hashMap);
//		
//	}
//	
//}
//4.Travesal of java HashMap
public class GFG {
	
	public static void main(String[] args) {
		HashMap<String, Integer>hashMap= new HashMap<String,Integer>();
		
		hashMap.put("John", 10);
		hashMap.put("Badsha", 20);
		hashMap.put("Lamine", 30);
		
		
		
		for(Map.Entry<String, Integer>e : hashMap.entrySet()) {
			System.out.println("Key: "+e.getKey()+"Value:"+e.getValue());
		}
		
	}
	
}
