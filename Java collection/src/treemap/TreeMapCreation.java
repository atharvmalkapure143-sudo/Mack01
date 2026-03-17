package treemap;

import java.io.ObjectOutputStream.PutField;
import java.nio.file.FileSystemNotFoundException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;






//public class TreeMapCreation {
//
//	public static void main(String[] args) {
//		TreeMap<String, Integer>tm= new TreeMap<>();
//		System.out.println("TreeMap elements: "+ tm);
//
//	}
//
//}


//1TreeMap
//public class TreeMapCreation {
//	static void Constructor() {
//		TreeMap<Integer, String>tm= new TreeMap<Integer,String>();
//		
//		tm.put(10, "Geeks");
//		tm.put(15, "For");
//		tm.put(20, "Geeks");
//		
//		System.out.println("TreeMap elements: "+ tm);
//
//	}
//	public static void main(String[] args) {
//		
//		System.out.println("TreeMap using TreeMap () constructor");
//		
//		Constructor();
//		
//
//	}
//
//}
//2Tremap (Comparator comp)
//class Student{
//	
//	int rollno;
//	String name,address;
//	
//	public Student(int rollno,String name, String address) {
//		
//		this.rollno=rollno;
//		this.name=name;
//		this.address=address;
//	}
//	public String toString() {
//		return this.rollno+" "+this.name+" "+ this.address;
//	}
//}
//class SortByRoll implements Comparator<Student>{
//	
//	public int compare(Student a,Student b) {
//		return a.rollno -b.rollno;
//	}
//}
//
//public class TreeMapCreation {
//	public static void main(String args[]) {
//	TreeMap<Student,Integer>tm= new TreeMap<>(new SortByRoll());
//	tm.put(new Student(111,"Mack","Waghapur"),1);
//	tm.put(new Student(131,"Atharv","Siddeshwarnagar"),2);
//	tm.put(new Student(121,"Malka","waghaland"),3);
//	
//	System.out.println("Treemap sorted by roll number: "+tm);
//	
//	
//}
//}


//3 Treemap(Map m)

//public class TreeMapCreation {
//	static void Constructor() {
//		Map<Integer, String>m= new HashMap<Integer,String>();
//		m.put(10, "Mack");
//		m.put(20, "For");
//		m.put(30, "Mack");
//		
//		TreeMap<Integer, String>tm= new TreeMap<>(m);
//		System.out.println("TreeMap: "+tm);
//	}
//	public static void main(String [] args) {
//		System.out.println("TreeMap Using TreeMap(Map)Constructor");
//		Constructor();
//	}
//}


//1.adding elements

//public class TreeMapCreation {
//	public static void main(String[] Args) {
//		TreeMap<Integer,String>tm=new TreeMap<>();
//		tm.put(3, "Mack");
//		tm.put(2, "For");
//		tm.put(1, "Mack");
//		System.out.println("TreeMap with raw type: "+ tm);
//	
//	TreeMap<Integer,String>tm1=new TreeMap<>();
//	tm1.put(3, "java");
//	tm1.put(2, "redux");
//	tm1.put(1, "C++");
//	System.out.println("TreeMap with generics:: "+ tm1);
//}
//}

//2 changing elements

//public class TreeMapCreation {
//	public static void main(String[] Args) {
//		TreeMap<Integer,String>tm=new TreeMap<>();
//		tm.put(3, "Mack");
//		tm.put(2, "For");
//		tm.put(1, "Mack");
//		System.out.println("TreeMap with raw type: "+ tm);
//	
//	tm.put(2, "Badsha");
//	System.out.println(tm);
//}
//}

//removing elements
//public class TreeMapCreation {
//	public static void main(String[] Args) {
//		TreeMap<Integer,String>tm=new TreeMap<>();
//		tm.put(3, "Mack");
//		tm.put(2, "For");
//		tm.put(1, "Man");
//		tm.put(4, "Chacha");
//		System.out.println("TreeMap with raw type: "+ tm);
//	
//	tm.remove(4);
//	System.out.println(tm);
//}
//}

public class TreeMapCreation {
	public static void main(String[] Args) {
		TreeMap<Integer,String>tm=new TreeMap<>();
		tm.put(3, "Mack");
		tm.put(2, "For");
		tm.put(1, "Man");
		
	for (Map.Entry<Integer, String>e:tm.entrySet()) {
		
		int k=e.getKey();
		String v=e.getValue();
	System.out.println(k+" : "+v);
	
	}
}
}


