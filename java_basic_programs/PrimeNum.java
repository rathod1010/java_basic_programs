package java_basic_programs;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number ");
		int num = scan.nextInt();
		boolean result = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				result = true;
				break;
			}
		}

		if (!result) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}

	}

}
