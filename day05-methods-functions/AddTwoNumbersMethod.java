package day5;
import java.util.*;
public class AddTwoNumbersMethod {
	
	static int add(int num1, int num2) {
		return(num1+num2);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num: ");
		int num1=sc.nextInt();
		System.out.println("Enter second num: ");
		int num2=sc.nextInt();
		int addition=add(num1,num2);
		System.out.println("Addition of numbers:"+addition);
		sc.close();
	}
}
