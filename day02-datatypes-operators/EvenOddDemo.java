package day2;
import java.util.*;
public class EvenOddDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		int evenodd= num % 2;
		if(evenodd == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		sc.close();
	}
}
