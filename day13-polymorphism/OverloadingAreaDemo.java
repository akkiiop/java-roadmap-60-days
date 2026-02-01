package day13;

import java.util.*;

class Area {
    double area(double r) {
        return 3.14 * r * r;
    }

    int area(int l, int w) {
        return l * w;
    }
}

public class OverloadingAreaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Area a = new Area();

        double r = sc.nextDouble();
        int l = sc.nextInt();
        int w = sc.nextInt();

        System.out.println("Circle Area: " + a.area(r));
        System.out.println("Rectangle Area: " + a.area(l, w));

        sc.close();
    }
}

