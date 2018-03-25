package programmingFundamentals2;

import java.util.Scanner;
/*
 * Write a program to generate the reverse of a given number. Print the corresponding reverse.
 */
/* Sample Input 1    Sample Output 1
 *   1234            4321
 */ 
/* Sample Input 2    Sample Output2
 *   1980            891
 */
public class ReverseNum {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		
		scan.close();
		
		int rev = 0, d = 0;

		while(n!=0)
		{
			d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		System.out.print(rev);
	}

}
