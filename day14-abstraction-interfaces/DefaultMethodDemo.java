package day14;

interface Service {

    default void welcome() {
        System.out.println("Welcome User");
    }

    void start();
}

class App implements Service {

    public void start() {
        System.out.println("Service Started");
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {

        App a = new App();
        a.welcome();
        a.start();
    }
}

