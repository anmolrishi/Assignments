package programmingFundamentals2;

import java.util.Scanner;
/*
 * Write a program that asks the user for a number n and gives him the possibility to choose between
 * computing the sum and computing the product of 1 ,..., n. And then calculates the sum or 
 * product accordingly.
 */
/*
 * If user enters -
 1 : Print sum of 1 to n numbers
 2 : Print product of 1 to n numbers
 Any other number : print -1
 */
/* Sample Input 1    Sample Output 1
 *   10              55
 *   1
 */  
/* Sample Input 2    Sample Output 2
 *   10              3628800
 *   2
 */  
/* Sample Input 3    Sample Output 3
 *   10              -1
 *   4
 */ 
public class SumorProduct {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		System.out.println("Enter the choice: ");
		int cho = scan.nextInt();
		scan.close();
		int sum = 0, product = 1;
		
		switch(cho)
		{
		case 1 : for(int i=1;i<=n;i++)
			     sum+=i;
		         System.out.print(sum);
		         break;

		case 2 : for(int i=1;i<=n;i++)
			     product*=i;
		         System.out.print(product);
		         break;

		default : System.out.print("-1");
		}
	}
}
