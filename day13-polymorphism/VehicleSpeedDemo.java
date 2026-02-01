package day13;

class Vehicle {
    void speed() {
        System.out.println("Vehicle Speed");
    }
}

class Car extends Vehicle {
    void speed() {
        System.out.println("Car Speed: 120 km/h");
    }
}

public class VehicleSpeedDemo {
    public static void main(String[] args) {

        Vehicle v = new Car();
        v.speed();
    }
}

