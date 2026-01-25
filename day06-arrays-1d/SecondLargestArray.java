package day6;

import java.util.Scanner;

public class SecondLargestArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int second = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] > max) {
                second = max;
                max = arr[i];
            }
            else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
        }

        System.out.println("Second Largest = " + second);

        sc.close();
    }
}

