package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;


//public class Yup {
//
//	public static void main(String[] args) {
//       Stack<Integer> s=new Stack<>();
//       s.push(1);
//       s.push(2);
//       s.push(3);
//       s.push(4);
//       while(!s.empty()) {
//    	   System.out.println(s.pop());
//    	   
//       }
//
//	}
//
//}
//adding


//public class Yup {
//	
//	public static void main(String[] args) {
//		Stack<String> s=new Stack<>();
//		Stack<String> s2=new Stack<String>();
//		s.push("Mack");
//		s.push("badsha");
//		s.push("bony");
//		
//		s2.push("Bhau");
//		s2.push("Kaka");
//		s2.push("Mama");
//		
//			System.out.println(s);
//			System.out.println(s2);
//			
//		
//		
//	}
//	
//}

//Accessing elements

//public class Yup{
//	
//	public static void main(String []args) {
//		Stack<String>S=new Stack<String>();
//		S.push("Welcome");
//		S.push("to");
//		S.push("geeks");
//		S.push("for");
//		S.push("geeks");
//		
//		System.out.println("Inatial Stack:"+S);
//		System.out.println("The elements at the top of the:"+"stack is:"+S.peek());
//		System.out.println("final Stack:"+S);
//		
//		
//	}
//}


//removing elements


//public class Yup{
//	public static void main(String[] args) {
//		
//		Stack<Integer>s= new Stack<Integer>();
//		s.push(10);
//		s.push(15);
//		s.push(30);
//		s.push(20);
//		s.push(5);
//		
//		System.out.println("Inatial stack:"+s);
//		System.out.println(" Popped element:"+s.pop());
//		System.out.println(" Popped element:"+s.pop());
//		System.out.println("Stack after po operation :"+s);
//		System.out.println("Is empty stack? :"+s.empty());
//		
//		s.pop();
//		s.pop();
//		s.pop();
//		
//		System.out.println("Is stack empty?"+ s.empty());
//	}
//}
//


//prioritiz use of deque over Stack
public class Yup{
	public static void main(String[] args) {
		Stack<Integer>stack =new Stack<>();
		Deque<Integer>deque= new ArrayDeque<>();
		
		stack.push(1);
		deque.push(1);
		stack.push(2);
		deque.push(2);
		
		List<Integer>list1=
				stack.stream().collect(Collectors.toList());
		System.out.println("Using Stack:");
		for(int i=0; i<list1.size();i++) {
			System.out.println(list1.get(i)+" ");
		}
		System.out.println();
		List<Integer>list2=
				deque.stream().collect(Collectors.toList());
		System.out.println("Using deque:");
		for(int i=0; i<list2.size();i++) {
			System.out.println(list2.get(i)+" ");
		}
		System.out.println();
	}
}

























