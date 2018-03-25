package recursion1;

import java.util.Scanner;
/*
 * Write a recursive function that returns the sum of the digits of a given integer.
 */
/* Sample Input 1     Sample Output 1
 * 12345              15
 */
public class SumofDigits {

	public static int sumOfDigits(int input)
	{
		// Write your code here

		//Base condition
		if(input == 0)
			return 0;

		return ((input % 10) + sumOfDigits(input / 10));
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		s.close();
		System.out.println(sumOfDigits(a));
	}

}
