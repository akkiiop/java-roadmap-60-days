package day9;
import java.util.*;
public class InsertDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int pos = sc.nextInt();
	    String text = sc.next();
	     
	    StringBuilder sb=new StringBuilder(s);
	    sb.insert(pos, text);
	    System.out.println(sb);
		sc.close();
	}
}
