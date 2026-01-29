package day10;

import java.util.Scanner;

class College {

    String name,city;

    College(String name,String city){
        this.name=name;
        this.city=city;
    }

    void register(){
        System.out.println("College Registered");
    }
}

public class CollegeDemo {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        String city=sc.nextLine();

        College c=new College(name,city);
        c.register();
    }
}

