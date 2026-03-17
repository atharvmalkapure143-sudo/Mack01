package iterableinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//public class Mack {
//
//	public static void main(String[] args) {
//	 List<String>list=new ArrayList<String>();
//	 list.add("Mack");
//	 list.add("For");
//	 list.add("Mack");
//	 
//	 for(String element: list) {
//		 
//		 System.out.println(element);
//	 }
//
//	}
//
//}


//public class Mack {
//
//	public static void main(String[] args) {
//	 List<String>list=new ArrayList<String>();
//	 list.add("Mack");
//	 list.add("For");
//	 list.add("Mack");
//	 
//	list.forEach( (element)->
//		 
//		 {System.out.println(element);
//	 });
//
//	}
//
//}


public class Mack {

	public static void main(String[] args) {
	 List<String>list=new ArrayList<String>();
	 list.add("Mack");
	 list.add("For");
	 list.add("Mack");
	 Iterator <String> iterator= list.iterator();
	while( iterator.hasNext()){
		String element =iterator.next();
	
		 
		 System.out.println(element);
	 }

	}

}