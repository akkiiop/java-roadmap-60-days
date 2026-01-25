package day6;
import java.util.*;
public class PrintArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Array elements: ");
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(+i);
		}
		sc.close();
	}
}
