package day14;

abstract class Device {

    void connect() {
        System.out.println("Device Connected");
    }

    abstract void work();
}

class SmartTV extends Device {

    void work() {
        System.out.println("Device Working");
    }
}

public class SmartDeviceDemo {
    public static void main(String[] args) {

        Device d = new SmartTV();
        d.connect();
        d.work();
    }
}

