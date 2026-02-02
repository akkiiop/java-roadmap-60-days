package day14;

interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {

    public void showA() {
        System.out.println("Hello from A");
    }

    public void showB() {
        System.out.println("Hello from B");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {

        C obj = new C();
        obj.showA();
        obj.showB();
    }
}

