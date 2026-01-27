package day8;
import java.util.*;
public class PrintCharacters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		System.out.println("Characters in the string: ");
		for(int i=0;i<s.length();i++) {
			
			System.out.println(s.charAt(i));
		}
		sc.close();
	}
}
