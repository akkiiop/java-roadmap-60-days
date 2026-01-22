package day3;

import java.util.Scanner;

public class CafeMenuSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.println("3. Sandwich");
        System.out.println("4. Exit");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        int quantity, price = 0;
        String item = "";

        switch (choice) {
            case 1:
                item = "Coffee";
                price = 50;
                break;

            case 2:
                item = "Tea";
                price = 30;
                break;

            case 3:
                item = "Sandwich";
                price = 80;
                break;

            case 4:
                System.out.println("Thank you! Visit again ");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice ❌");
                sc.close();
                return;
        }

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        int total = price * quantity;

        System.out.println("Order: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + total);

        sc.close();
    }
}

