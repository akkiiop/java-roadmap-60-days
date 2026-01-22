package day3;
import java.util.*;
public class AttendanceEligibility {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total classes: ");
		double totalClasses=sc.nextDouble();
		System.out.println("Enter attended classes: ");
		double attClasses=sc.nextDouble();
		double per=(attClasses*100)/totalClasses;
		if(per<75) {
			System.out.println("Not allowed, attendance is bellow 75%");
		}else {
			System.out.println("Attendance: "+per+"%");
			System.out.println("Allowed");
		}
		sc.close();
	}
}
