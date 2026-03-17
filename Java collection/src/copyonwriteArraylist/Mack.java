package copyonwriteArraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;





//public class Mack extends Thread {
//	
//	
//	static CopyOnWriteArrayList<String>list=new CopyOnWriteArrayList<>();
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			list.add("D");
//		}	
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//list.add("A");
//list.add("B");
//list.add("C");
//
//Mack m=new Mack();
//m.start();
//Thread.sleep(1000);
//Iterator itr=list.iterator();
//while(itr.hasNext()) {
//	String s=(String)itr.next();
//	System.out.println(s);
//	Thread.sleep(1000);
//}
//System.out.println(list);
//	}
//
//}




//2
public class Mack  {
	
	


	public static void main(String[] args)  {
		// TODO Auto-generated method stub
CopyOnWriteArrayList<String>list=new CopyOnWriteArrayList<>();


Iterator itr=list.iterator();
list.add("mack");
System.out.println("List contains::");
while(itr.hasNext()) 
	
	System.out.println(itr.next());
	
	itr=list.iterator();
	System.out.println("List contains::");
	while(itr.hasNext()) 
		
		System.out.println(itr.next());
		
	


	}

}









