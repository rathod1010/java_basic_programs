package java_basic_programs;

import java.util.Scanner;

public class PrimeNumbersBetween {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int start = scan.nextInt();
		System.out.println("Enter second number");
		int end = scan.nextInt();
		System.out.println("Prime number between " + start + " and " + end + " are :");
		for (int i = start; i <= end; i++) {
			boolean res = false;

			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					res = true;
					break;
				}
			}
			if (!res) {
				System.out.print(i + " ");
			}

		}
	}

}
