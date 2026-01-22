package day3;
import java.util.*;
public class DeliveryChargesCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cart total: ");
		int cartTotal=sc.nextInt();
		int deliveryFee;
		if(cartTotal>=499) {
			deliveryFee=0;
		}else if(cartTotal>=200 && cartTotal<=498){
			deliveryFee=40;
		}else {
			deliveryFee=70;
		}
		int finalPayAmt=cartTotal+deliveryFee;
		 System.out.println("Delivery Fee: " + deliveryFee);
	     System.out.println("Final Payable Amount: " + finalPayAmt);
		sc.close();
	}
}
