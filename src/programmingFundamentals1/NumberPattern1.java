package programmingFundamentals1;

import java.util.Scanner;
/*
 * Print the following pattern for the given number of rows. Pattern for N = 4
 * 1
   11
   111
   1111
 */

public class NumberPattern1 {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = scan.nextInt();
		scan.close();

		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i; j++)
			{
				System.out.print("1");
			}
			System.out.print("\n");
		}
	}

}
