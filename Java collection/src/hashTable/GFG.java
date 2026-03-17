package hashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

//public class GFG {
//
//	public static void main(String[] args) {
//		Hashtable<String, Integer>ht= new Hashtable<>();
//		ht.put("One", 1);
//		ht.put("Two",2);
//		ht.put("Three", 3);
//		
//		System.out.println("HashTable elements ::"+ht);
//
//	}
//
//}
//public class GFG {
//	
//	public static void main(String[] args) {
//		Hashtable<Integer, String>ht= new Hashtable<>();
//		Hashtable<Integer, String>ht2= new Hashtable<>();
//		ht.put(1,"one");
//		ht.put(2,"two");
//		ht.put(3,"three");
//		
//		ht2.put(4,"four");
//		ht2.put(5,"five");
//		ht2.put(6,"six");
//
//		
//		
//	
//		
//		System.out.println("Mapping of ht1 ::"+ht);
//		System.out.println("Mapping of ht2 ::"+ht2);
//		
//	}
//	
//}


//public class GFG {
//	
//	public static void main(String[] args) {
//		Hashtable<Integer, String>ht= new Hashtable<>(4);
//		Hashtable<Integer, String>ht2= new Hashtable<>(2);
//		ht.put(1,"one");
//		ht.put(2,"two");
//		ht.put(3,"three");
//		
//		ht2.put(4,"four");
//		ht2.put(5,"five");
//		ht2.put(6,"six");
//
//		
//		
//	
//		
//		System.out.println("Mapping of ht1 ::"+ht);
//		System.out.println("Mapping of ht2 ::"+ht2);
//		
//	}
//	
//}

//public class GFG {
//	
//	public static void main(String[] args) {
//		Hashtable<Integer, String>ht= new Hashtable<>(4,0.75f);
//		Hashtable<Integer, String>ht2= new Hashtable<>(3,0.5f);
//		ht.put(1,"one");
//		ht.put(2,"two");
//		ht.put(3,"three");
//		
//		ht2.put(4,"four");
//		ht2.put(5,"five");
//		ht2.put(6,"six");
//
//		
//		
//	
//		
//		System.out.println("Mapping of ht1 ::"+ht);
//		System.out.println("Mapping of ht2 ::"+ht2);
//		
//	}
//	
//}


//public class GFG {
//	
//	public static void main(String[] args) {
//		Map<Integer, String>ht= new HashMap<>();
//		ht.put(1,"one");
//		ht.put(2,"two");
//		ht.put(3,"three");
//		Hashtable<Integer, String>ht2= new Hashtable<>(ht);
//			
//		
//		System.out.println("Mapping of ht2 ::"+ht2);
//		
//	}
//	
//}

//1.adding
//public class GFG {
//	
//	public static void main(String[] args) {
//		Hashtable<Integer, String>ht= new Hashtable<>(4,0.75f);
//		Hashtable<Integer, String>ht2= new Hashtable<>(3,0.5f);
//		ht.put(1,"one");
//		ht.put(2,"two");
//		ht.put(3,"three");
//		
//		ht2.put(1,"four");
//		ht2.put(2,"five");
//		ht2.put(3,"six");
//
//		
//		
//	
//		
//		System.out.println("Mapping of ht1 ::"+ht);
//		System.out.println("Mapping of ht2 ::"+ht2);
//		
//	}
//	
//}

//2 changing elements


//public class GFG {
//	
//	public static void main(String[] args) {
//		Hashtable<Integer, String>ht= new Hashtable<>(4,0.75f);
//		
//		ht.put(1,"one");
//		ht.put(2,"one");
//		ht.put(3,"one");
//		
//		
//		System.out.println("Initial Map ::"+ht);
//		
//		ht.put(2, "two");
//		
//		System.out.println("Updated Map ::"+ht);
//		
//	}
//	
//}


//3Removing element


//public class GFG {
//	
//	public static void main(String[] args) {
//		Hashtable<Integer, String>ht= new Hashtable<>(4,0.75f);
//		
//		ht.put(1,"one");
//		ht.put(2,"two");
//		ht.put(3,"one");
//		ht.put(3,"two");
//		
//		
//		System.out.println("Initial Map ::"+ht);
//		
//		ht.remove(4);
//		
//		System.out.println("Updated Map ::"+ht);
//		
//	}
//	
//}


//4.Traversal of a hashtable

public class GFG {
	
	public static void main(String[] args) {
		Hashtable<String, Integer>ht= new Hashtable<>(4,0.75f);
		
		ht.put("mack",10);
		ht.put("Badsha",30);
		ht.put("chacha",20);
	
		for(Map.Entry<String,Integer>e: ht.entrySet()) {
			
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
		
		
	}
	
}






