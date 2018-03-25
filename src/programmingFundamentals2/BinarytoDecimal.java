package programmingFundamentals2;

import java.util.Scanner;
/*
 * Given a binary number as an integer, convert it into decimal and print.
 */
/* Sample Input 1    Sample Output 1
 *   1100            12
 */
/* Sample Input 2    Sample Output 2
 *   111             7
 */
public class BinarytoDecimal {


	public static void main(String args[]) 
	{

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter binary number: ");
		int binary = scan.nextInt();
		
		scan.close();
		
		int decimal = 0;
		int power = 0;
		
		while(true)
		{
			if(binary == 0)
			{
				break;
			} 
			else 
			{
				int tmp = binary%10;
				decimal += tmp*Math.pow(2, power);
				binary = binary/10;
				power++;
			}
		}
		System.out.print(decimal);
	}

}
