package day4;
import java.util.Scanner;

public class PinValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        boolean isValid = true;

        // condition 1: length must be 4 and no spaces
        if (pin.length() != 4 || pin.contains(" ")) {
            isValid = false;
        }

        // condition 2: all must be digits
        if (isValid) {
            for (int i = 0; i < 4; i++) {
                char ch = pin.charAt(i);
                if (ch < '0' || ch > '9') {
                    isValid = false;
                    break;
                }
            }
        }

        // condition 3: not all digits same
        if (isValid) {
            boolean allSame = true;
            for (int i = 1; i < 4; i++) {
                if (pin.charAt(i) != pin.charAt(0)) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) isValid = false;
        }

        if (isValid)
            System.out.println("Valid PIN ");
        else
            System.out.println("Invalid PIN ");

        sc.close();
    }
}

