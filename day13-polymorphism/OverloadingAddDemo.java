package day13;

import java.util.*;

class Add {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingAddDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Add obj = new Add();

        int a = sc.nextInt();
        int b = sc.nextInt();

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("Sum (int): " + obj.add(a, b));
        System.out.println("Sum (double): " + obj.add(x, y));

        sc.close();
    }
}

