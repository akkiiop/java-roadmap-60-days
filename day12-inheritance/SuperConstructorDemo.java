package day12;

import java.util.*;

class Person2 {
    int id;

    Person2(int id) {
        this.id = id;
        System.out.println("Person Constructor");
    }
}

class Student2 extends Person2 {
    String name;

    Student2(int id, String name) {
        super(id);
        this.name = name;
        System.out.println("Student Constructor");
    }

    void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class SuperConstructorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

        Student2 s = new Student2(id, name);
        s.show();

        sc.close();
    }
}

