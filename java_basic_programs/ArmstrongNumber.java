package java_basic_programs;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// sum of the power of their digits
		System.out.println("Enter number please");
		int num = sc.nextInt();
		int originalNum = num;
		int result = 0;
		int digits = 0;
		for (int temp = num; temp != 0; temp /= 10, ++digits)
			;
		for (int temp = num; temp != 0; temp /= 10) {
			int lastDigit = temp % 10;
			result += Math.pow(lastDigit, digits);
		}
		if (result == originalNum)
			System.out.println(originalNum + " is an Armstrong number.");
		else
			System.out.println(originalNum + " is not an Armstrong number.");
	}
}
