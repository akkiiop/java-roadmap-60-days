package day12;

class Parent2 {
    void show() {
        System.out.println("Parent Class");
    }
}

class Child2 extends Parent2 {
    void show() {
        System.out.println("Child Class Implementation");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        p.show();
    }
}

