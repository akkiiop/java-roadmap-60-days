package day8;

import java.util.*;

public class CountVowelsConsonants {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        String v = "aeiou";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (v.indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }

            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        sc.close();
    }
}

