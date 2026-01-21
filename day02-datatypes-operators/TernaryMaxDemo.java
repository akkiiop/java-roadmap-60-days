package day2;
import java.util.*;
public class TernaryMaxDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
	
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		
		int large=(num1 > num2) ? num1:num2;
		System.out.println("Largest Number: "+large);
		sc.close();
	}
}
