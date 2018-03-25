package programmingFundamentals1;

import java.util.Scanner;
/*
 * Write a program to find x to the power n (i.e. x^n). 
 * Take x and n from the user. You need to print the answer.
 */
/*  Sample Input 1 :        Sample Output 1 : 
 *  3                        81
 *  4
 */
/*  Sample Input 2 :        Sample Output 2 : 
 *  2                        32
 *  5
 */
public class FindPowOfNum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter base: ");
		double x = scanner.nextDouble();

		System.out.println("Enter power: ");
		double n = scanner.nextDouble();

		scanner.close();

		double power1 = Math.pow(x,n);
		int r1 = (int)Math.round(power1);

		System.out.println(r1);
	}
}
