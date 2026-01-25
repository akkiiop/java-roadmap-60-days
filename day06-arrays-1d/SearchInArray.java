package day6;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                System.out.println("Found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }

        sc.close();
    }
}

