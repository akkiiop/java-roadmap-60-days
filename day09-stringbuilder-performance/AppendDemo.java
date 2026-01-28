package day9;
import java.util.*;

public class AppendDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        sb.append(a).append(" ")
          .append(b).append(" ")
          .append(c);

        System.out.println(sb);
    }
}

