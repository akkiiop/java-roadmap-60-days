package day10;

import java.util.Scanner;

class Car {

    String brand;
    int speed;

    Car(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }

    void run(){
    	System.out.println("Brand name: "+brand);
        System.out.println("Car Running at " + speed + " km/h");
    }
}

public class CarDemo {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String brand=sc.next();
        int speed=sc.nextInt();

        Car c=new Car(brand,speed);
        c.run();
    }
}

