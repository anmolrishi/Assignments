package programmingFundamentals1;

import java.util.Scanner;
/*
 * Print the following pattern for the given number of rows. Pattern for N = 4
 * 1234
   123
   12
   1
 */

public class NumberPattern4 {

	public static void main(String[] args)
	{

		int i, j;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int n = scan.nextInt();

		scan.close();

		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}

}
