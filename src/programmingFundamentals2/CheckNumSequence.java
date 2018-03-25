package programmingFundamentals2;

import java.util.Scanner;
/*
 * You are given S a sequence of n integers i.e. S = s1, s2, ..., sn. Please, compute if it is 
 *  possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (1 <= i < n) in 
 *  such a way that the first part is strictly decreasing while the second is strictly increasing
 *  one. That is, in the sequence if numbers are decreasing, they can start increase at one point.
 *  And once number starts increasing, they cannot decrease at any point further.
 *  Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. 
 *  So in both the cases, print true. You just need to print true/false. No need to split the 
 *  sequence.
 */
/*
 * Sample Input 1 :      Sample Output 1 :
    5                    true
    9 8 4 5 6
 */
/*
 * Sample Input 2 :      Sample Output 2 :
    3                    true
    1 2 3
 */
/*
 * Sample Input 3 :      Sample Output 3 :
    3                     true
    8 7 6
 */
/*
 * Sample Input 4 :      Sample Output 4 :
    6                    false
    8 7 6 5 8 2
 */
public class CheckNumSequence {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of terms: ");
		int n = scan.nextInt();

		boolean isDec = true;
		int prev = Integer.MAX_VALUE;
		int current;

		System.out.println("Enter the sequence: ");
		int i=1;
		while(i<=n)
		{

			current = scan.nextInt();
			if(isDec)
			{
				if(current>prev)
				{
					isDec=false;
				}
			}
			else
			{
				if(current<prev)
				{ System.out.println("false");
				return;
				}
			}
			i++; prev = current;

		}
		scan.close();
		System.out.println("true");

	}
}
