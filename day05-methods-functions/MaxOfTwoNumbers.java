package day5;
import java.util.*;
public class MaxOfTwoNumbers {
	
	static int max(int nu1,int nu2) {
		return nu1*nu2;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		int multiplication=max(num1,num2);
		System.out.println("Multiplication: "+multiplication);
		sc.close();
	}
}
