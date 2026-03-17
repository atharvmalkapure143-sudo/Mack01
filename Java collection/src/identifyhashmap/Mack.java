package identifyhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;



//public class Mack {
//	
//	public static void main(String[] args)
//	{
//		Map<String, String>hm= new IdentityHashMap<>();
//		hm.put("Badsha", "BadshaValue");
//		hm.put(new String("Badsha"), "BadshaValue1");
//		System.out.println("Size of IdentiHashMap ::: "+hm.size());
//	}
//
//}

//1.adding elements
//public class Mack {
//	
//	public static void main(String[] args)
//	{
//		Map<Integer, String>hm= new IdentityHashMap<>();
//		hm.put(10, "Badsha");
//		hm.put(15, "4");
//		hm.put(20, "Badsha");
//		hm.put(25, "Welcomes");
//		hm.put(30, "You");
//		System.out.println("Initial Mapping are ::: "+hm);
//		String returned_value=  (String)hm.put(20,"All");
//		
//		System.out.println("Returned value is::"+returned_value);
//		System.out.println("New Map is::"+hm);
//		Map<Integer, String>mn=new  IdentityHashMap<Integer,String>(hm);
//		System.out.println("The new Map is::"+mn);
//	}
//
//}

//2.removing elements

//public class Mack {
//	
//	public static void main(String[] args)
//	{
//		Map<Integer, String>hm= new IdentityHashMap<>();
//		hm.put(10, "Badsha");
//		hm.put(15, "4");
//		hm.put(20, "Badsha");
//		hm.put(25, "Welcomes");
//		hm.put(30, "You");
//		
//		System.out.println("Initial Mappings are::: "+hm);
//		String returned_value= (String)hm.remove(20);
//		System.out.println("Returned value	 are::: "+returned_value);
//		System.out.println("New Map is::: "+hm);
//	}
//
//}

//3.Accesing the elements

//public class Mack {
//	
//	public static void main(String[] args)
//	{
//		Map<Integer, String>hm= new IdentityHashMap<Integer,String>();
//		hm.put(10, "Badsha");
//		hm.put(15, "4");
//		hm.put(20, "Badsha");
//		hm.put(25, "Welcomes");
//		hm.put(30, "You");
//		
//		System.out.println("Initial Mappings are::: "+hm);
//		
//		System.out.println("The value	 are::: "+hm.get(25));
//		System.out.println("The value	 are::: "+hm.get(10));
//		System.out.println("The set is::: "+hm.keySet());
//		System.out.println("The set is::: "+hm.entrySet());
//	}
//
//}

//4.Traversing
//public class Mack {
//	
//	public static void main(String[] args)
//	{
//		Map<Integer, String>hm= new IdentityHashMap<Integer,String>();
//		hm.put(10, "Badsha");
//		hm.put(15, "4");
//		hm.put(20, "Badsha");
//		hm.put(25, "Welcomes");
//		hm.put(30, "You");
//		
//		System.out.println("Initial Mappings are::: "+hm);
//		Iterator<IdentityHashMap.Entry<Integer,String>>
//		itr= hm.entrySet().iterator();
//		while(itr.hasNext()) {
//			
//			IdentityHashMap.Entry<Integer, String>entry=itr.next();
//		System.out.println("Key ="+entry.getKey()+",value="
//				+entry.getValue());
//	
//		}
//		}
//
//}


///
//public class Mack {
//	
//	public static void main(String[] args)
//	{
//		Map<String, String>hm= new HashMap<>();
//		Map<String, String>hm1= new IdentityHashMap<>();
//		hm.put("Badsha", "Badshavalue");
//		hm.put(new String("Badsha"),"BadshaValue1");
//		
//		hm1.put("iBadsha", "iBadshavalue");
//		hm1.put(new String("iBadsha"),"iBadshaValue1");
//		
//		
//		System.out.println("Size of HashMap is::: "+hm.size());
//		System.out.println("Size of IdentifyHashMap is::: "+hm1.size());
//		
//		System.out.println("*___________________________*");
//	
//		
//		}
//
//}


public class Mack {
	
	public static void main(String[] args)
	{
		
		IdentityHashMap<String, Integer>hm1= new IdentityHashMap<>();
		
		String key1=new String("key");
		String key2=new String("key");
		hm1.put(key1, 1);
		hm1.put(key2, 2);
		
		
		
		System.out.println(hm1.get(key1));
		System.out.println(hm1.get(key2));
		System.out.println(hm1.get(new String ("key")));
		
		System.out.println("*___________________________*");
	
		
		}

}



