package day4;

import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secretNumber = 7;
        int guess;
        int attempts = 0;

        System.out.println(" Guess the Number Game!");
        System.out.println("Hint: number is between 1 to 10");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println(" Correct! You guessed it in " + attempts + " attempts.");
                break;
            } else if (guess > secretNumber) {
                System.out.println("Too High  Try again!");
            } else {
                System.out.println("Too Low  Try again!");
            }
        }

        sc.close();
    }
}

