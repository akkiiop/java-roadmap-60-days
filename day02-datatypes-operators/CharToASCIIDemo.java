package day2;
import java.util.*;
public class CharToASCIIDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character: ");
		char ch=sc.next().charAt(0);
		int asciiValue=(int) ch;
		System.out.println("ASCII value: "+asciiValue);

		sc.close();
	}
}
