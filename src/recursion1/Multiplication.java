package recursion1;

import java.util.Scanner;
/*
 * Given two integers m & n, calculate and return their multiplication using recursion. 
 * You can only use subtraction and addition for your calculation. No other operators are allowed.
 */
/* Sample Input 1     Sample Output 1
 * 3 5                15
 */
public class Multiplication {

	public static int multiplyTwoIntegers(int m, int n)
	{
		// Write your code here
		if (m < n)
		{
			return multiplyTwoIntegers(n, m);
		}
		else if (n != 0)
		{
			return (m + multiplyTwoIntegers(m, n - 1));
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		s.close();
		System.out.println(multiplyTwoIntegers(a,b));
	}

}
