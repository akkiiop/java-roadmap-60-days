package day13;

class Employee {
    int bonus() {
        return 5000;
    }
}

class Manager extends Employee {
    int bonus() {
        return 10000;
    }
}

public class EmployeeBonusDemo {
    public static void main(String[] args) {

        Employee e = new Manager();

        System.out.println("Manager Bonus: " + e.bonus());
    }
}

