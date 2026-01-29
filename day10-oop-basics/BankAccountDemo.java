package day10;

import java.util.Scanner;

	class Account{
		int accno;
		double balance;
		
		Account(int accno,double balance ){
			this.accno=accno;
			this.balance=balance;
		}
		
		public void show() {
			System.out.println("Balance:"+balance);
		}
	}
	public class BankAccountDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		double ball=sc.nextDouble();
		Account a=new Account(no,ball);
		a.show();
		sc.close();
	}
}
