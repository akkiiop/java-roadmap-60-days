package day10;

class Demo {

    Demo(){
        System.out.println("Default Constructor");
    }

    Demo(int x){
        System.out.println("Parameterized Constructor: " + x);
    }
}

public class ConstructorOverloadDemo {
    public static void main(String[] args){

        Demo d1=new Demo();
        Demo d2=new Demo(8);
    }
}

