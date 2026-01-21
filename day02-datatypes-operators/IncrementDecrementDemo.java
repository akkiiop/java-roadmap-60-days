package day2;
import java.util.*;
public class IncrementDecrementDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		int postI=a++;
		System.out.println("Post Increment (a++): "+postI);
		System.out.println("After post increment: "+a);
		int preI=++a;
		System.out.println("Pre Increment (++a): "+preI);
		int postD=a--;
		System.out.println("Post Decrement (a--): "+postD);
		System.out.println("After Post Decrement: "+a);
		int preD=--a;
		System.out.println("Pre Decrement (--a): "+preD);
		
		sc.close();
		
	}
}
