package day12;
class Parent{
	int salary=30000;
	
}
class Child extends Parent{
	int salary=50000;
	
	void show() {
		System.out.println("Salary of Parent: "+super.salary);
		System.out.println("Salary of Child: "+salary);
	}
}


public class SuperVariableDemo {
	public static void main(String[] args) {
		Child c=new Child();
		c.show();
	}
}
