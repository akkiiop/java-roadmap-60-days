package day13;

class Parent {
    void show() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child Method Called");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {

        Parent p = new Child();
        p.show();
    }
}

