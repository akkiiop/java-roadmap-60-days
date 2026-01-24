package day5;
import java.util.*;

public class UtilityMethodsDemo {

    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Square: " + square(num));
        System.out.println("Cube: " + cube(num));

        if (isPositive(num))
            System.out.println("Positive number");
        else
            System.out.println("Not positive");

        sc.close();
    }
}
