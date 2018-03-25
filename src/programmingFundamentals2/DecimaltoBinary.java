package programmingFundamentals2;

import java.util.Scanner;
/*
 * Given a decimal number, convert it into binary and print.

The binary number should be in the form of an integer.

Note : The given input number could be large, so the 
corresponding binary number can exceed the integer range. So take the answer as long.
 */
/* Sample Input 1    Sample Output 1
 *   12              1100
 */
/* Sample Input 2    Sample Output 2
 *   7               111
 */
public class DecimaltoBinary {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the decimal number: ");
		int number = scan.nextInt();

		scan.close();

		int binary[] = new int[25];
		int index = 0;
		while(number > 0)
		{
			binary[index++] = number%2;
			number = number/2;
		}
		for(int i = index-1;i >= 0;i--)
		{
			System.out.print(binary[i]);
		}
	}
}
