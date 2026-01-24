package day5;
import java.util.*;

public class PalindromeMethod {

    static boolean isPalindrome(int num) {
        int original = num;
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return original == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isPalindrome(num))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}
