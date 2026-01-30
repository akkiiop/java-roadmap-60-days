package day11;

class Company {
    private String name = "TCS";

    public String getName() {
        return name;
    }
}

public class ReadOnlyDemo {
    public static void main(String[] args) {
        Company c = new Company();

        System.out.println("Company: " + c.getName());
    }
}

