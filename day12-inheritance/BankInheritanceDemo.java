package day12;

import java.util.*;

class Account {
    double balance;
}

class SavingsAccount extends Account {
    void addInterest() {
        balance = balance + (balance * 0.10);
        
    }
}

public class BankInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingsAccount s = new SavingsAccount();

        s.balance = sc.nextDouble();
        s.addInterest();

        System.out.println("Savings Balance: " + s.balance);

        sc.close();
    }
}

