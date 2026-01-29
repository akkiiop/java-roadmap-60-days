package day10;

import java.util.Scanner;

class Book {

    int id;
    String name,author;

    Book(int id,String name,String author){
        this.id=id;
        this.name=name;
        this.author=author;
    }

    void display(){
        System.out.println("Book Added Successfully");
    }
}

public class BookDemo {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int id=sc.nextInt();
        String name=sc.next();
        String author=sc.next();

        Book b=new Book(id,name,author);
        b.display();
    }
}

