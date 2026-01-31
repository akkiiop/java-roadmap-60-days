package day12;

class Animal {
}

class Dog extends Animal {
    void show() {
        System.out.println("Dog is an Animal");
    }
}

public class IsARelationshipDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }
}

