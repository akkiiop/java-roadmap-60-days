package day12;
import java.util.*;

class Employee {
    double salary = 50000;
}

class Manager extends Employee {
    double bonus;

    double totalSalary() {
        return salary + bonus;
    }
}

public class EmployeeManagerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      

        Manager m = new Manager();
        m.bonus = sc.nextDouble();

        System.out.println("Total Salary: " + m.totalSalary());

        sc.close();
    }
}

