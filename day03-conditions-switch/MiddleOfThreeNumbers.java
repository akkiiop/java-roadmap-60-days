package day3;

import java.util.Scanner;

public class MiddleOfThreeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:  ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1<num2 && num1<num3) {
			if(num2<num3) {
				System.out.println("the middle no."+num2);
			}else {
				
			
			System.out.println("The middle number is: "+num3);
			}
		}else if(num2<num3 && num2<num1) {
			if(num3<num1) {
				System.out.println("the middle no."+num3);
			}else {
				
			
			System.out.println("The middle number is: "+num1);
			}
		}
		sc.close();
	}

}
