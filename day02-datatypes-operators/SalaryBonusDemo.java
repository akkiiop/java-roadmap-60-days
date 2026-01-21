package day2;
import java.util.*;
public class SalaryBonusDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary: ");
		double salary=sc.nextDouble();
		System.out.println("Enter bonus percentage: ");
		double percentage=sc.nextDouble();
		double bonusAmount=(percentage*salary)/100;
		System.out.println("Bonus Amount: "+bonusAmount);
		double totalSalary=salary+bonusAmount;
		System.out.println("Total Salary: "+totalSalary);
		sc.close();
		
	}
}
