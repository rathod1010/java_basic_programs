package java_basic_programs;

import java.util.Scanner;

public class ReverseNumberExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number please ");
		int num = sc.nextInt();
		int reverseNum =0;
		 while(num!=0)
		 {
			 int lastDigit=num%10;
			 reverseNum = reverseNum*10+lastDigit;
			 num=num/10;
		 }
		 System.out.println("The reverse number of given number is "+reverseNum);

	}

}
