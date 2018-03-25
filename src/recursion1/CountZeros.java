package recursion1;

import java.util.Scanner;
/*
 * Given an integer n, count and return the number of zeros that are present in the given integer 
 * using recursion.
 */
/* Sample Input 1     Sample Output 1
 * 10204              2
 */
public class CountZeros {

	public static int countZerosRec(int input)
	{
		// Write your code here
		if(input == 0)
			return 0;

		if(input %10 ==0)
			return 1 + countZerosRec(input / 10);
		else
			return countZerosRec(input/10); 
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		s.close();
		System.out.println(countZerosRec(a));
	}

}
