package day5;
import java.util.*;

public class SumOfDigitsMethod {

    static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Sum of digits: " + sumOfDigits(num));
        sc.close();
    }
}
