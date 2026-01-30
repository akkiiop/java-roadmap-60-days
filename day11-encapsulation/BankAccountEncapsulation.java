package day11;
import java.util.*;
class BankAccount{
	private int accno;
	private double balance;
	
	//Account Number
	public void setAccountNo(int accno) {
		this.accno=accno;
	}
	
	public int getAccountNo() {
		return accno;
	}
	
	//Balance
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
}

public class BankAccountEncapsulation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		BankAccount b=new BankAccount();
		
		System.out.println("Enter Account Number");
		b.setAccountNo(sc.nextInt());
		
		System.out.println("Enter Balance");
		b.setBalance(sc.nextDouble());
		
		System.out.println("Account Details:");
		System.out.println("Account Number"+b.getAccountNo());
		System.out.println("Balance "+b.getBalance());
		sc.close();
	}
	
}
