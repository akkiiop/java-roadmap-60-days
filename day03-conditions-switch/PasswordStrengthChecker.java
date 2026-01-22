package day3;
import java.util.*;
public class PasswordStrengthChecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password: ");
		String pass=sc.nextLine();
		int length=pass.length();
		if(length<6) {
			System.out.println("Password Strength: Weak");
		}else if(length >= 6 && length <= 9){
			System.out.println("Password Strength: Medium");
		}else {
			System.out.println("Password Strength: Strong");
		}
		sc.close();
	}
}
