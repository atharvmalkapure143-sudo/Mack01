package enumsetinjava;

import java.security.PublicKey;
import java.util.EnumSet;
import java.util.Iterator;


//enum Student{Geek1,Geek2,Geek3,Geek4,Geek5}
//public class Geeks {
//	public static void main(String [] args) {
//		
//		EnumSet<Student>e= EnumSet.of(Student.Geek1,Student.Geek2,Student.Geek3);
//		
//		System.out.println("EnumSet: "+ e);
//	}
//
//}


//enum e{ CODE,LEARN,CONTRIBUTE,QUIZ,MCQ};
//
//public class Geeks{
//	public static void main(String [] args) {
//		EnumSet<e>s1,s2,s3,s4;
//		s1=EnumSet.of(e.QUIZ,e.CONTRIBUTE,e.LEARN,e.CODE);
//		s2=EnumSet.complementOf(s1);
//		s3=EnumSet.allOf(e.class);
//		s4=EnumSet.range(e.CODE, e.CONTRIBUTE);
//		
//		System.out.println("set 1:: "+s1);
//		System.out.println("set 2:: "+s2);
//		System.out.println("set 3:: "+s3);
//		System.out.println("set 4:: "+s4);
//				
//	}
//}

//public class Geeks{
//	enum Game{Cricket,hockey,fottball}
//	public static  void main(String[] args) {
//		EnumSet<Game>g= EnumSet.allOf(Game.class);
//		System.out.println("EnumSet: "+g);
//			
//	}
//}
//1.add
//public class Geeks{
//	enum Game{Cricket,hockey,fottball}
//	public static  void main(String[] args) {
//		EnumSet<Game>g= EnumSet.allOf(Game.class);
//		EnumSet<Game>g1= EnumSet.noneOf(Game.class);
//		g1.add(Game.hockey);
//		
//		System.out.println("EnumSet Using add():: "+g1);
//		g1.addAll(g);
//		System.out.println("EnumSet Using addAll():: "+g1);
//			
//	}
//}

//2.accesing element

//public class Geeks{
//	enum Game {CRICKET,HOCKEY,FOOTBALL}
//	public static void main(String []args) {
//		EnumSet<Game>g=EnumSet.allOf(Game.class);
//		Iterator<Game>i=g.iterator();
//		System.out.println("EnumSet: ");
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//			System.out.println(", ");
//		}
//	}
//}
//removing element
public class Geeks{
	enum Game{CRICKET,FOOTBALL,HOCKEY}
	public static void main(String [] args) {
		EnumSet<Game>g=EnumSet.allOf(Game.class);
		
		System.out.println("EnumSet::"+ g);
		 boolean b=g.remove(Game.CRICKET);
		System.out.println(" remove EnumSet::"+ b);
	boolean b2=	g.removeAll(g);
		System.out.println(" remove all EnumSet::"+ b2);
		
	}
}