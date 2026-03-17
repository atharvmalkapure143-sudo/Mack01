package javacomparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;




//class Student implements Comparable<Student>{
//	String name;
//	int marks;
//	 Student(String name,int marks) {
//		 this.name=name;
//		 this.marks=marks;
//		 
//		
//	}
//	 @Override
//	public int compareTo(Student other) {
//		// TODO Auto-generated method stub
//		return this.marks-other.marks;
//		
//	}
//	 @Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return name+" : "+ marks;
//	}
//	 
//	
//}
//
//public class Developer {
//
//	public static void main(String[] args) {
//		List<Student>students=new ArrayList<>();
//		students.add(new Student("Badshee", 90));
//		students.add(new Student("Chintu", 40));
//		students.add(new Student("Tango", 35));
//		
//		Collections.sort(students);
//		
//		for(Student s: students) {
//			System.out.println(s);
//		}
//
//	}
//
//}

public class Developer {

	public static void main(String[] args) {
		
		String[] names= {"Chacha","Athu the rider","Bob"};
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
	}
	
}
	