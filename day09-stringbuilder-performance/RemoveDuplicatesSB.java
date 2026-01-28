package day9;

import java.util.*;

public class RemoveDuplicatesSB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (sb.indexOf("" + ch) == -1) {
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}

