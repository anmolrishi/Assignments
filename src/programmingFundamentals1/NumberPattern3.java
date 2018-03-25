package programmingFundamentals1;

import java.util.Scanner;
/*
 * Print the following pattern for the given number of rows. Pattern for N = 4
 * 1
   11
   121
   1221
 */
public class NumberPattern3 {

	public static void main(String[] args) 
	{

		int i, j, k = 1;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int n = scan.nextInt();

		scan.close();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if ( j == 1 || j == i )
					k = 1;
				else
					k = 2;
				System.out.print(k);
			}
			System.out.print("\n");
		}

	}
}
