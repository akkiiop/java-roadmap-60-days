package day9;

import java.util.*;

public class DeleteDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        StringBuilder sb = new StringBuilder(s);
        sb.delete(start, end);

        System.out.println(sb);
        sc.close();
    }
}

