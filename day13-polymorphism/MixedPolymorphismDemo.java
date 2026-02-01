package day13;

class Shape1 {

    int area(int l, int w) {
        return l * w;
    }

    double area(double r) {
        return 3.14 * r * r;
    }
}

public class MixedPolymorphismDemo {
    public static void main(String[] args) {

        Shape1 s = new Shape1();

        System.out.println("Area: " + s.area(10, 5));
        System.out.println("Area: " + s.area(5.0));
    }
}

