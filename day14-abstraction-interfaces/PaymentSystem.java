package day14;

interface Payment {

    void pay();
}

class UPI implements Payment {

    public void pay() {
        System.out.println("Payment via UPI");
        System.out.println("Payment Successful");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {

        Payment p = new UPI();
        p.pay();
    }
}

