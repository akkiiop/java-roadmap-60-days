package day14;

import java.util.*;

abstract class Shape {

    abstract double area();
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

public class AbstractShapeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        Shape s = new Circle(r);

        System.out.println("Area: " + s.area());

        sc.close();
    }
}

