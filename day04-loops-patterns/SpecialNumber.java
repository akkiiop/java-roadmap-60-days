package day4;

import java.util.*;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 2-digit number: ");
        int num = sc.nextInt();

        int temp = num;

        int sum = 0;
        int product = 1;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }

        int result = sum + product;

        if (result == num) {
            System.out.println(num + " is a Special Number ");
        } else {
            System.out.println(num + " is NOT a Special Number ");
        }

        sc.close();
    }
}

