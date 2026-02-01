package day13;

import java.util.*;

class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    int l, w;

    Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }

    double area() {
        return l * w;
    }
}

public class ShapeAreaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        int l = sc.nextInt();
        int w = sc.nextInt();

        Shape s1 = new Circle(r);
        Shape s2 = new Rectangle(l, w);

        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());

        sc.close();
    }
}

