package day4;

import java.util.*;

public class StrongNumberChecker {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + factorial(digit);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Strong Number ");
        } else {
            System.out.println(num + " is NOT a Strong Number ");
        }

        sc.close();
    }
}

