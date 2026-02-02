package day14;

interface Machine {

    void print();
    void scan();
}

class Printer implements Machine {

    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Machine m = new Printer();
        m.print();
        m.scan();
    }
}

