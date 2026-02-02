package day14;

abstract class Vehicle {

    abstract void run();

    void speed() {
        System.out.println("Car speed is 120");
    }
}

class Car extends Vehicle {

    void run() {
        System.out.println("Car is running");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Vehicle v = new Car();
        v.run();
        v.speed();
    }
}

