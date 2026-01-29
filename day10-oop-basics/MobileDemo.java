package day10;

import java.util.Scanner;

class Mobile {

    String brand;
    int price;

    Mobile(String brand,int price){
        this.brand=brand;
        this.price=price;
    }

    void save(){
        System.out.println("Mobile Info Saved");
    }
}

public class MobileDemo {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String brand=sc.next();
        int price=sc.nextInt();

        Mobile m=new Mobile(brand,price);
        m.save();
    }
}

