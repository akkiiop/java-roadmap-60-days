package day3;
import java.util.*;

public class TriangleTypeChecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 numbers: ");
		double s1=sc.nextDouble();
		double s2=sc.nextDouble();
		double s3=sc.nextDouble();
		if(s1+s2 > s3 && s1+s3 > s2 && s3+s2 > s1) {
			System.out.println("Valid Triangle");
			if(s1==s2 && s2==s3) {
				System.out.println("Type: Equilateral Triangle");
			}else if(s1==s2 || s2==s3 || s3==s1 ) {
				System.out.println("Type: Isosceles Triangle");
			}else if(s1 != s2 && s2 != s3 && s1 != s3){
				System.out.println("Type: Scalene Triangle");
			}
		}else {
			System.out.println("Invalid Triangle");
		}
		sc.close();
	}
}
