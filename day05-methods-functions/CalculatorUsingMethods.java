package day5;
import java.util.*;

public class CalculatorUsingMethods {

    static int add(int a, int b) { return a + b; }
    static int subtract(int a, int b) { return a - b; }
    static int multiply(int a, int b) { return a * b; }
    static double divide(int a, int b) { return a / b; }
    static int modulus(int a, int b) { return a % b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Add  2.Subtract  3.Multiply  4.Divide  5.Modulus");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Result: " + add(a, b)); break;
            case 2: System.out.println("Result: " + subtract(a, b)); break;
            case 3: System.out.println("Result: " + multiply(a, b)); break;
            case 4: System.out.println("Result: " + divide(a, b)); break;
            case 5: System.out.println("Result: " + modulus(a, b)); break;
            default: System.out.println("Invalid choice");
        }

        sc.close();
    }
}
