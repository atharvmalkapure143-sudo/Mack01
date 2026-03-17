package javacomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class Student{
//	int rollno;
//	String name;
//	
//	 Student(int rollno,String name) {
//		this.rollno=rollno;
//		this.name=name;
//	}
//	public String toString() {
//		return rollno+" :"+name;
//	}
//	
//}
//
//class SortByRoll implements Comparator<Student>{
//	
//	@Override
//	public int compare(Student a, Student b) {
//		// TODO Auto-generated method stub
//		return a.rollno - b.rollno;
//	}
//}
//
//public class Kaka65 {
//
//	public static void main(String[] args) {
//     List<Student>students=new ArrayList<>();
//     students.add(new Student(111, "Mayank"));
//     students.add(new Student(131, "Anshul"));
//     students.add(new Student(121, "Solanki"));
//     students.add(new Student(101, "Aggrawal"));
//     
//     Collections.sort(students,new SortByRoll());
//     System.out.println("Sorted by Roll Number::");
//     for(Student s:students) {
//    	 System.out.println(s);
//     }
//     
//
//	}
//
//}

//class student{
//	String name;
//	Integer age;
//	
//	 student(String name,Integer age) {
//		this.name=name;
//		this.age=age;
//		
//	}
//	 public String getName() {
//		return name;
//	}
//	 public Integer getAge() {
//		return age;
//	}
//	 @Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return name +" : "+ age;
//	}
//	 
//}
//class StudentComparator implements Comparator<student>{
//	@Override
//	public int compare(student s1, student s2) {
//     int nameCompare=s1.getName().compareTo(s2.getName());
//     int ageCompare=s1.getAge().compareTo(s2.getAge());
//		return (nameCompare==0)? ageCompare:nameCompare;
//	}
//}
//public class Kaka65{
//	public static void main(String[] args) {
//		
//		List<student>students=new ArrayList<>();
//		students.add(new student("Bony", 32));
//		students.add(new student("Zarif", 24));
//		students.add(new student("Batti", 25));
//		System.out.println("Orignal List:");
//		for(student s: students) {
//			System.out.println(s);
//		}
//		Collections.sort(students ,new StudentComparator());
//		
//		System.out.println("\n After Sorting ");
//		for(student s: students) {
//			System.out.println(s);
//		}
//	}
//}


//3



class student{
	String name;
	Integer age;
	
	 student(String name,Integer age) {
		this.name=name;
		this.age=age;
		
	}
	 public String getName() {
		return name;
	}
	 public Integer getAge() {
		return age;
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return name +" : "+ age;
	}
	 
}
class StudentComparator implements Comparator<student>{
	@Override
	public int compare(student s1, student s2) {
     int nameCompare=s1.getName().compareTo(s2.getName());
     int ageCompare=s1.getAge().compareTo(s2.getAge());
		return (nameCompare==0)? ageCompare:nameCompare;
	}
}
public class Kaka65{
	public static void main(String[] args) {
		
		List<student>students=new ArrayList<>();
		students.add(new student("Bony", 32));
		students.add(new student("Zarif", 24));
		students.add(new student("Batti", 25));
		System.out.println("Orignal List:");
		for(student s: students) {
			System.out.println(s);
		}
		System.out.println();
		students.sort(Comparator.comparing(student::getName).thenComparing(student::getAge));
		
		System.out.println("\n After Sorting ");
		for(student s: students) {
			System.out.println(s);
		}
	}
}





























