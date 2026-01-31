package day12;
import java.util.*;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
		System.out.println("Person Created");
	}
}

class Student extends Person{
	int roll;
	
	Student(String name, int age,int roll){
		super(name,age);
		this.roll=roll;
		System.out.println("Student Created");
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Roll No: "+roll);
	}
}


public class SingleInheritanceDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Age: ");
		int age=sc.nextInt();
		System.out.println("EnterRoll No: ");
		int roll=sc.nextInt();
		Student s= new Student(name,age,roll);
		s.display();
		sc.close();
	}
}
