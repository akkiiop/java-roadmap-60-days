package day12;

class Parent1 {
    void display() {
        System.out.println("Parent Display");
    }
}

class Child1 extends Parent1 {
    void display() {
        super.display();
        System.out.println("Child Display");
    }
}

public class SuperMethodDemo {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.display();
    }
}

