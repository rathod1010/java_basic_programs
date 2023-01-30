package java_basic_programs;

import java.util.Scanner;

public class FactorialExample {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = 1, fact = 1;
		int num = sc.nextInt();
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println("factorial of " + num + " is " + fact);

	}

}
