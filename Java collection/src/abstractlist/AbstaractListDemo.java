package abstractlist;

import java.util.AbstractList;
import java.util.ArrayList;
//1
//public class AbstaractListDemo {
//
//	public static void main(String[] args) {
//	AbstractList<String>list=new ArrayList<String>();
//	list.add("Geeks");
//	list.add("for");
//	list.add("Geeks");
//	list.add("10");
//	list.add("20");
//	System.out.println("AbstractList:"+list);
//
//	}
//
//}
import java.util.LinkedList;
import java.util.List;


//2

//public class AbstaractListDemo{
//	public static void main(String[] args) {
//		AbstractList<String>list= new LinkedList<String>();
//		
//		list.add("Geeks");
//		list.add("for");
//		list.add("Geeks");
//		list.add("10");
//		list.add("20");
//		
//		System.out.println("AbstractList:"+list);
//		list.remove(3);
//		System.out.println(" final AbstractList: "+list);
//		int lastindex=list.lastIndexOf("A");
//		System.out.println("last index of A: "+lastindex);
//		
//		
//		
//	}
//}




  public class AbstaractListDemo extends AbstractList<Integer>{
	
	  private int size;
	
	public AbstaractListDemo(int size) {
		this.size=size;
	} 
	@Override
	public Integer get(int index) {
		return index;
	}
	@Override
	public int size() {
		return size;
	}
	public static void main(String[] args) {
		List<Integer>list= new  AbstaractListDemo(5);
		for(int i : list) {
			System.out.println(i);
		}
	}
}


 