package day5;
import java.util.*;
public class EvenOddMethod {
	
	static boolean evenodd(int num) {
		if(num%2==0) {
			System.out.println("even");
			return true;
			
		}else {
			System.out.println("odd");
			return false;
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		evenodd(number);
		
		sc.close();
	}
}
