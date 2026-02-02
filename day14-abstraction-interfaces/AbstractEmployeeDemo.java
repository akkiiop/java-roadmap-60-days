package day14;

import java.util.*;

abstract class Employee {

    abstract double totalSalary();
}

class Manager extends Employee {

    double salary;

    Manager(double salary) {
        this.salary = salary;
    }

    double totalSalary() {
        return salary + 5000;
    }
}

public class AbstractEmployeeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sal = sc.nextDouble();

        Employee e = new Manager(sal);

        System.out.println("Total Salary: " + e.totalSalary());

        sc.close();
    }
}

