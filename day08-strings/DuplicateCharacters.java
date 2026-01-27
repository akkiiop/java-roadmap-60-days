package day8;

import java.util.*;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase();

        System.out.println("Duplicate characters:");

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0';
                }
            }

            if (count > 1 && arr[i] != '0') {
                System.out.println(arr[i] + " → " + count + " times");
            }
        }

        sc.close();
    }
}

