package day10;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    void calculate(){
        double bonus = salary * 0.10;
        double total = salary + bonus;

        System.out.println("Employee Details");
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + total);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int id=sc.nextInt();
        String name=sc.next();
        double salary=sc.nextDouble();

        Employee e=new Employee(id,name,salary);
        e.calculate();
        sc.close();
    }
}

