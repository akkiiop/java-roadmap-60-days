package day11;
import java.util.*;
class Employee{
	private int id;
	private String name;
	private double salary;
	
	// Employee ID
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	// Employee Name
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	// Salary
	public void setSalary(double salry) {
		this.salary=salry;
	}
	
	public double getSalary() {
		return salary;
	}
}

public class EmployeeEncapsulation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		
		System.out.println("Enter ID: ");
		e.setId(sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Enter Name: ");
		e.setName(sc.nextLine());
		
		System.out.println("Enter Salary: ");
		e.setSalary(sc.nextDouble());
		
		System.out.println("Employee Details: ");
		System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
		
		sc.close();
	}

	
}
