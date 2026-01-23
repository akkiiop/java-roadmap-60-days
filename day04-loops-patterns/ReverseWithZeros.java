package day4;
import java.util.Scanner;

public class ReverseWithZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String num = sc.nextLine();   

        String rev = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            rev = rev + num.charAt(i);
        }

        System.out.println("Reversed: " + rev);

        sc.close();
    }
}
