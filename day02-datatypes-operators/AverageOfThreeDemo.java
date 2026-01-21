package day2;
import java.util.*;
public class AverageOfThreeDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:  ");
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		double num3=sc.nextDouble();
		double avg=(num1+num2+num3)/3;
		System.out.println("Average :- "+avg);
		sc.close();
	}
}
