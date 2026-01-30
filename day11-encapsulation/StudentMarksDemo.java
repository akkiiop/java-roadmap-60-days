package day11;
import java.util.*;
class Student{
	private int id;
	private String name;
	private double marks;
	
	//id
	public void setId(int id){
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	//name
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	
	//marks
	public void setMarks(double marks) {
		if(marks>=0 && marks<=99) {
			this.marks=marks;
		}
		else {
			System.out.println("Invalid Marks");
		}
		
	}
	
	public double getMarks() {
		return marks;
	}
}

public class StudentMarksDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		
		System.out.println("Enter ID: ");
		s.setId(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("Enter Name: ");
	    s.setName(sc.nextLine());

	    System.out.print("Enter Marks: ");
	    s.setMarks(sc.nextDouble());
	     
	    System.out.println("\nStudent Details");
	    System.out.println("ID: " + s.getId());
	    System.out.println("Name: " + s.getName());
	    System.out.println("Marks: " + s.getMarks());
		sc.close();
	}
}
