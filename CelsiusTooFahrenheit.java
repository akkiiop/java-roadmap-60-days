package day1;

import java.util.Scanner;

public class CelsiusTooFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter celsius value: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("C to F: " + fahrenheit);

        sc.close();
    }
}

