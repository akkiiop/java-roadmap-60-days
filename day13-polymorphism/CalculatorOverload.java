package day13;

import java.util.*;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class CalculatorOverload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator c = new Calculator();

        int a = sc.nextInt();
        int b = sc.nextInt();

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("Result: " + c.add(a, b));
        System.out.println("Result: " + c.add(x, y));

        sc.close();
    }
}

