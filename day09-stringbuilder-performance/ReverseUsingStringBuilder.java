package day9;
import java.util.*;
public class ReverseUsingStringBuilder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		StringBuilder sbb=new StringBuilder(s);
		
		sbb.reverse();
		System.out.println("Reversed string:"+sbb);
		sc.close();
	}
}
