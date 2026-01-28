package day9;

import java.util.*;

public class PasswordMasking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();

        int len = pass.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len - 2; i++) {
            sb.append("*");
        }

        sb.append(pass.substring(len - 2));

        System.out.println(sb);
        sc.close();
    }
}
