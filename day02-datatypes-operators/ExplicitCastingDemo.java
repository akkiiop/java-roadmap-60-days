package day2;

import java.util.Scanner;

public class ExplicitCastingDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter double ");
		double num=sc.nextDouble();
		int expNum=(int) num;
		System.out.println("Int value: "+expNum);
		sc.close();
	}
}
