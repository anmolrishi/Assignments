package programmingFundamentals2;

import java.util.Scanner;
/*
 * Given a number n, find the square root with an accuracy of d decimal points. 
 * n & d is provided by the user. If the number is perfect square, print integer only. 
 * For eg. if n = 16 & d = 2, output should be 4
 */
/* Sample Input 1    Sample Output 1
 *   10 4            3.1622
 */
/* Sample Input 2    Sample Output 2
 *   16 2            4
 */
/* Sample Input 3    Sample Output 3
 *   10 0            3
 */
public class SquareRootDecimal {

	public static void main(String[] args) 
	{

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		
		System.out.println("Enter the decimal precison: ");
		int d=s.nextInt();
		
		s.close();

		double sqrt=Math.sqrt(n);
		int sqr=0;

		while((sqr*sqr)<=n)
		{
			sqr++;
		}

		sqr--;
		if(sqr*sqr==n)
		{
			System.out.println(sqr);
			return;
		}


		sqrt*=Math.pow(10,d);

		int temp=(int)sqrt;

		double ans = (int)temp/Math.pow(10,d);


		System.out.println(ans);
	}

}
