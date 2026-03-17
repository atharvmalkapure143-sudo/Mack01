package weakHashMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
//1
//public class GFG {
//
//	public static void main(String[] args) {
//	 Map<Number, String>weak=new WeakHashMap<Number,String>();
//	 
//	 weak.put(1, "Mack");
//	 weak.put(2, "For");
//	 weak.put(3, "Mack");
//	 
//	 System.out.println("our weak map: "+weak);
//	 
//	 if(weak.containsValue("F"
//	 		+ ""
//	 		+ "or")) 
//		 System.out.println("for exist");
//	 
//	 
//	 if(weak.containsKey(1))
//		 System.out.println("1 exist");
//	 
//	 weak.clear();
//	 
//	 
//	 if(weak.isEmpty())
//		 
//		 System.out.println("empty map: "+ weak);
//
//	}
//
//}

//2


//public class GFG{
//	public static void main(String[] args) {
//		
//		Map<Number, String>weak= new WeakHashMap<Number,String>();
//		
//		weak.put(1, "geeks");
//		weak.put(2, "for");
//		weak.put(3, "geeks");
//		
//		Set set1 = weak.entrySet();
//		System.out.println(set1);
//		
//		Set keySet= weak.keySet();
//		System.out.println("key set: "+keySet);
//		
//		Collection value= weak.values();
//		
//		System.out.println("values::"+value);
//		
//	}
//}
//
//3


public class GFG{
	public static void main(String [] args) {
		Map<Number, String>weak=new WeakHashMap<Number,String>();
		
		weak.put(1, "mack");
		weak.put(2, "for");
		weak.put(3, "mack");
		Map<Number, String>weak1=new WeakHashMap<Number,String>();
		
		weak1.putAll(weak);
		System.out.println(weak1.get(2));
		System.out.println(" Size of Map is::"+weak1.size());
		weak1.remove(2);
		System.out.println(" Size after removing is::"+weak1.size());
	}
}















