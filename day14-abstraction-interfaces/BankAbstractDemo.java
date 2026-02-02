package day14;

abstract class Bank {

    abstract double getRate();
}

class SBI extends Bank {

    double getRate() {
        return 6.5;
    }
}

public class BankAbstractDemo {
    public static void main(String[] args) {

        Bank b = new SBI();
        System.out.println("Interest: " + b.getRate() + "%");
    }
}

