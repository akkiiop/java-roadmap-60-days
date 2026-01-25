package day6;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];   
        }

        System.out.println("Copied Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }

        sc.close();
    }
}

