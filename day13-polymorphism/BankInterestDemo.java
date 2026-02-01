package day13;

class Bank {
    double getRate() {
        return 4.0;
    }
}

class SBI extends Bank {
    double getRate() {
        return 6.0;
    }
}

public class BankInterestDemo {
    public static void main(String[] args) {

        Bank b = new SBI(); 

        System.out.println("Interest Rate: " + b.getRate() + "%");
    }
}

