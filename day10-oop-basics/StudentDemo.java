package day10;
import java.util.*;

class Student{
	int id;
	String name;
	
	Student(int id, String name){
		System.out.println("Student Created");
        this.id = id;
        this.name = name;
	}
	

	void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
public class StudentDemo {
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id=sc.nextInt();
		System.out.println("Enter name: ");
		String name=sc.next();
		
		Student s=new Student(id, name);
		s.display();
		sc.close();
	}
}
