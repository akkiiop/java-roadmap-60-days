package day4;

import java.util.*;

public class PasswordRetrySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "Akki@123";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter password: ");
            String inputPassword = sc.nextLine();

            if (inputPassword.equals(correctPassword)) {
                System.out.println("Login Successful!");
                sc.close();
                return;
            } else {
                attempts--;
                System.out.println("Incorrect Password. Attempts left: " + attempts);
            }
        }

        System.out.println("Account Locked! Too many attempts.");

        sc.close();
    }
}

