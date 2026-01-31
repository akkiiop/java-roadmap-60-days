package day12;

import java.util.*;

class Shape {
}

class Circle extends Shape {
    double r;

    double area() {
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    int l, w;

    int area() {
        return l * w;
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.r = sc.nextDouble();
        r.l = sc.nextInt();
        r.w = sc.nextInt();

        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());

        sc.close();
    }
}

