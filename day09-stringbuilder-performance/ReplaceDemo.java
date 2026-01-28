package day9;

import java.util.*;

public class ReplaceDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int start = sc.nextInt();
        int end = sc.nextInt();
        String r = sc.next();

        StringBuilder sb = new StringBuilder(s);
        sb.replace(start, end, r);

        System.out.println(sb);
        sc.close();
    }
}

