package day14;

interface Notification {

    void send();
}

class Email implements Notification {

    public void send() {
        System.out.println("Email Sent");
    }
}

public class NotificationSystem {
    public static void main(String[] args) {

        Notification n = new Email();
        n.send();
    }
}

