package day11;

class Login {
    private String password;

    public void setPassword(String password) {
        this.password = password;
        System.out.println("Password Saved!");
    }
}

public class WriteOnlyDemo {
    public static void main(String[] args) {
        Login l = new Login();

        l.setPassword("Akki@123");
    }
}

