package programmingFundamentals2;

import java.util.Scanner;
/*
 * Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
   N varies from 1 to last.
 */
/* Sample Input 1    Sample Output 1
 *   10              5 11 14 17 23 26 29 35 38 41
 */ 
/* Sample Input 2    Sample Output 2
 *   4               5 11 14 17
 */ 
public class TermsofAP {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x = scan.nextInt();
		scan.close();

		for(int i=1;i<=x;i++)
		{
			if((3*i+2)%4==0)
			{
				x++;
			}
			else
			{
				System.out.print((3*i)+2);
				System.out.print(" ");
			}
		}

	}
}
