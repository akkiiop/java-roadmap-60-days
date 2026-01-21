package day2;
import java.util.*;
public class ImplicitCastingDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int ");
		int num=sc.nextInt();
		double impNum=num;
		System.out.println("Double value: "+impNum);
		sc.close();
	}
}
