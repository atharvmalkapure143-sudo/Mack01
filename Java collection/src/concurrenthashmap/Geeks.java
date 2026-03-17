package concurrenthashmap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

//public class Geeks {
//
//	public static void main(String[] args) {
//		
//		
//		ConcurrentHashMap<String, Integer>map=new ConcurrentHashMap<>();
//		
//		map.put("A", 1);
//		map.put("B", 2);
//		map.put("C", 3);
//		System.out.println("Map size::"+map.size());
//		System.out.println("Value of A::"+map.get("A"));
//		map.remove("B");
//		System.out.println("After removal map size is:::"+map.size());
//		
//
//	}
//
//}




//2

//public class Geeks {
//
//	public static void main(String[] args) {
//		
//		
//		ConcurrentHashMap< Integer,String>map=new ConcurrentHashMap<>();
//		
//		map.put(1,"A");
//		map.put(2,"B");
//		map.put(3,"B");
//		map.putIfAbsent(2, "A");
//		map.remove(2, "B");
//		map.putIfAbsent(4, "A");
//		map.replace(3, "B","D");
//		System.out.println(map );
//		
//		
//
//	}
//
//}

//Adding

//public class Geeks {
//
//	public static void main(String[] args) {
//		
//		
//		ConcurrentHashMap< String,String>map=new ConcurrentHashMap<>();
//		
//		map.put("1","A");
//		map.put("2","B");
//		map.put("3","C");
//		map.put("4","D");
//		map.put("5","E");
//		map.put("6","F");
//		
//		System.out.println("map:"+map );
//		ConcurrentHashMap< String,String>map1=new ConcurrentHashMap<>(map);
//		
//		System.out.println("map1:"+map1 );
//
//	}
//
//}


      //REmoving

//public class Geeks {
//
//	public static void main(String[] args) {
//		
//		
//		ConcurrentHashMap< String,String>map=new ConcurrentHashMap<>();
//		
//		map.put("1","A");
//		map.put("2","B");
//		map.put("3","C");
//		map.put("4","D");
//		map.put("5","E");
//		map.put("6","F");
//		
//		System.out.println("map:"+map );
//		System.out.println();
//		String s=map.remove("6");
//		System.out.println("After removing mapping with key 6::");
//		System.out.println("map:"+map);
//		System.out.println("value removed:"+ s);
//		System.out.println();
//		s=map.remove("10");
//		System.out.println("After removing mapping with key 10::");
//		System.out.println("map::"+map);
//		System.out.println("valued removed::"+s);
//		map.clear();
//		System.out.println("Map after use of clea()::"+map);
//		
//		ConcurrentHashMap< String,String>map1=new ConcurrentHashMap<>(map);
//		
//		System.out.println("map1:"+map1 );
//
//	}
//
//}

//public class Geeks {
//
//	public static void main(String[] args) {
//		
//		
//		ConcurrentHashMap< Integer,String>map=new ConcurrentHashMap<>();
//		
//		map.put(100,"A");
//		map.put(101,"B");
//		map.put(102,"C");
//		map.put(103,"D");
//		
//		
//		System.out.println("Concurrentmap:"+map );
//		System.out.println("The value associated to"+"100 is:"+map.get(100));
//		System.out.println("The value associated to"+"103 is:"+map.get(103));
//		
//		
//		System.out.println("*========================*" );
//
//	}
//
//}




















//4iterating


public class Geeks {

	public static void main(String[] args) {
		
		
		ConcurrentHashMap< Integer,String>map=new ConcurrentHashMap<Integer,String>();
		
		map.put(100,"A");
		map.put(101,"B");
		map.put(102,"C");
		map.put(103,"D");
		
		Iterator<ConcurrentHashMap.Entry<Integer, String>> i=map.entrySet().iterator();
		while(i.hasNext()) {
			ConcurrentHashMap.Entry<Integer, String> entry=i.next();
			System.out.println("Key = "+entry.getKey()+",value="+entry.getValue());
		}
		
		
		
		
		
		System.out.println("*========================*" );

	}

}










