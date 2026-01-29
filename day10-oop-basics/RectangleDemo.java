package day10;

import java.util.Scanner;

class Rectangle {

    int le,wi;

    Rectangle(int l,int w){
        this.le=l;
        this.wi=w;
    }

    void area(){
        System.out.println("Area: " + (le*wi));
    }
}

public class RectangleDemo {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int l=sc.nextInt();
        int w=sc.nextInt();

        Rectangle r=new Rectangle(l,w);
        r.area();
    }
}

