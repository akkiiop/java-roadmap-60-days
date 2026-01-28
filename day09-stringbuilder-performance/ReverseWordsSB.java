package day9;

import java.util.*;

public class ReverseWordsSB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (String w : words) {

            StringBuilder sb = new StringBuilder(w);
            result.append(sb.reverse()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}

