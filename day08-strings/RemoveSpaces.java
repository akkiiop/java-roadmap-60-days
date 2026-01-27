package day8;

import java.util.*;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String result = str.replaceAll("\\s", "");

        System.out.println("Without spaces: " + result);

        sc.close();
    }
}

