package day13;

import java.util.*;

class Printer {

    void print(int x) {
        System.out.println("Integer: " + x);
    }

    void print(String s) {
        System.out.println("String: " + s);
    }

    void print(double d) {
        System.out.println("Double: " + d);
    }
}

public class PrintOverloadDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Printer p = new Printer();

        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        double d = sc.nextDouble();

        p.print(a);
        p.print(s);
        p.print(d);

        sc.close();
    }
}

