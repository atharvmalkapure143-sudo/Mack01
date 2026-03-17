package abstractSequentialList;

import java.security.PublicKey;
import java.util.AbstractSequentialList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;



//public class GfG {
//
//	public static void main(String[] args) {
//		AbstractSequentialList<Integer>a= new LinkedList<>();
//		
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		System.out.println(a);
//
//	}
//
//}

//public class GfG{
//	public static void main(String[] args) {
//		AbstractSequentialList<String>a= new LinkedList<String>();
//		a.add("Geeks");
//		a.add("for");
//		a.add("geeks");
//		a.add("10");
//		a.add("20");
//		
//		System.out.println(a);
//		a.remove(3);
//		System.out.println("Final list: "+a);
//		System.out.println("The element is: "+a.get(2));
//		
//			}
//}



public class GfG extends AbstractSequentialList<Integer>{
	private int size;
	public GfG(int size) {
		this.size=size;
		
	}
	public ListIterator<Integer>listIterator(int index){
		return new ListIterator<Integer>() {
			private int currentIndex=index;
			
			@Override
			public void set(Integer integer) {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
				
			}
			
			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
			
			@Override
			public int previousIndex() {
				// TODO Auto-generated method stub
				return currentIndex -1;
			}
			
			@Override
			public Integer previous() {
				// TODO Auto-generated method stub
				return currentIndex --;
			}
			
			@Override
			public int nextIndex() {
				// TODO Auto-generated method stub
				return currentIndex+1;
			}
			
			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return currentIndex++;
			}
			
			@Override
			public boolean hasPrevious() {
				// TODO Auto-generated method stub
				return currentIndex>0;
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return currentIndex<size;
			}
			
			@Override
			public void add(Integer e) {
				throw new UnsupportedOperationException();
				
			}
		};
	}
	public int size() {
		return size;
	}
	public static void main(String[] args) {
		List<Integer>list= new GfG(5);
		for(int i: list) {
			System.out.println(i);
		}
	}
	
}









