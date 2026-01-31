package day12;
import java.util.*;

class Person1{
	String name;
}

class Employee1 extends Person1{
	double salary;
}


class Manager1 extends Employee1{
	String dept;
	public void display() {
		System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Dept: " + dept);
	}
}
public class MultilevelInheritanceDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Manager1 m = new Manager1();

        m.name = sc.nextLine();
        m.salary = sc.nextDouble();
        sc.nextLine();
        m.dept = sc.nextLine();

        m.display();
		
		sc.close();
	}
}
