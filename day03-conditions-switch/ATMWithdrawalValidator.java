package day3;
import java.util.*;
public class ATMWithdrawalValidator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Blance: ");
		double bal=sc.nextDouble();
		System.out.println("Enter withdraw Amount: ");
		double withd=sc.nextDouble();
		double remAmt=bal-withd;
		
		if(withd<=0) {
			System.out.println("Invalid Withdrawl amount");
		}
		else if(bal<withd) {
			System.out.println("Can not withdraw, available balance is "+bal);
		}else if(withd %100!=0) {
			System.out.println("Withdrawal amount must be multiple of 100");
		}
		else {
			System.out.println("Transaction Successful");
			System.out.println("Remaining Amount: "+remAmt);
		}
		sc.close();
		}
}
