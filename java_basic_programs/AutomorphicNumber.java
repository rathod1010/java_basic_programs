package java_basic_programs;

import java.util.Scanner;

public class AutomorphicNumber {

	public static boolean isAutomorphic(int n) {
		int square = n * n;
		int len1 = (int) (Math.log10(n) + 1);
		int len2 = (int) (Math.log10(square) + 1);
		if (len2 > len1) {
			int d = (int) Math.pow(10, len1);
			return square % d == n;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		if (isAutomorphic(n)) {
			System.out.println(n + " is an automorphic number.");
		} else {
			System.out.println(n + " is not an automorphic number.");
		}
	}

}
