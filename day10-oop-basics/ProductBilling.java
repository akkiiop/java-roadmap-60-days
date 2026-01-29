package day10;

import java.util.Scanner;

class Product {

    String name;
    int price,qty;

    Product(String name,int price,int qty){
        this.name=name;
        this.price=price;
        this.qty=qty;
    }

    void bill(){
        int total = price * qty;
        System.out.println("Total Bill: " + total);
    }
}

public class ProductBilling {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String name=sc.next();
        int price=sc.nextInt();
        int qty=sc.nextInt();

        Product p=new Product(name,price,qty);
        p.bill();
    }
}

