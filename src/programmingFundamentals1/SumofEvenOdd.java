package programmingFundamentals1;
import java.util.Scanner;
/*
 * Write a program to input a number and print the sum of all it’s even digits and 
 * sum of all its odd digits separately.Digits means, numbers not the places. 
 * That is, if a number is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
 */

/* Sample Input 1       Sample Output 1
 * 1234                 6 4
 */
public class SumofEvenOdd {

	public static void main(String[] args) {

		System.out.println("Enter the number: ");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		int sum_even = 0, sum_odd=0;
		int d=0;  // digit

		while (n!=0)
		{
			d=n%10;
			if(d%2==0)
				sum_even+=d;
			else
				sum_odd+=d;

			n/=10;
		}
		
		System.out.print(sum_even);
		System.out.print(" ");
		System.out.print(sum_odd);

	}
}
