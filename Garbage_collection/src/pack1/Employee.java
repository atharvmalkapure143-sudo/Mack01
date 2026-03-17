package pack1;

import java.security.cert.X509Certificate;

///without Garbage collection
//public class Employee {
//	
//	private int ID;
//	private String name;
//	private int age;
//	private static int nextId=1;
//	public Employee(String name,int age) {
//		
//		this.name=name;
//		this.age=age;
//		this.ID=nextId++;
//	}
//	public void show() {
//		System.out.println("Id="+ID+"\nName="+name
//				+ "\nAge="+age);
//	}
//	public void showNextId()
//	{
//		System.out.println("Next employee id will be ="
//				+nextId);
//	}
//
//}
//class UseEmployee{
//	public static void main(String[] args) {
//		Employee E= new Employee("GFG1", 56);
//		Employee F= new Employee("GFG2", 45);
//		Employee G= new Employee("GFG3", 25);
//		E.show();
//		F.show();
//		G.show();
//		E.showNextId();
//		F.showNextId();
//		G.showNextId();
//		{
//			Employee x=new Employee("GFG4", 23);
//			Employee y=new Employee("GFG4", 21);
//			x.show();
//			y.show();
//			x.showNextId();
//			y.showNextId();
//		}
//		E.showNextId();
//	}
//}


//using Garbage collection and finalize()

class Employee{
	private int ID;
	private String name;
	private int age;
	private static int nextId=1;
	public Employee(String name,int age) {
		this.name=name;
		this.age=age;
		this.ID=nextId++;
		
	}
	public void show() {
		System.out.println("Id="+ID+"\nName="+name+"\nAge="+age);
	}
	public void  showNextId() {
		System.out.println("Next employee id will be="+nextId);
		
	}
	protected void finalize() {
		--nextId;
	}
}
class UnEmployee{
	public static void main(String [] args) {
		Employee E= new Employee("Mack", 99);
		Employee F= new Employee("Badsha", 89);
		Employee G= new Employee("bob", 79);
		
		E.show();
		F.show();
		G.show();
		
		E.showNextId();
		F.showNextId();
		G.showNextId();
		
		{
			Employee x=new Employee("Danieal", 69);
			Employee y=new Employee("cena", 59);
			x.show();
			y.show();
			x.showNextId();
			y.showNextId();
			x=y=null;
			System.gc();
			System.runFinalization();
		}
		E.showNextId();
			}
}







