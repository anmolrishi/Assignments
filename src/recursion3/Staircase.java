package recursion3;

import java.util.Scanner;

public class Staircase {
	/*
	 * A child is running up a staircase with n steps, and can hop either 1 step, 2 steps or 3 steps at
	 * a time. Implement a method to count how many possible ways the child can run up to the stairs. 
	 * You need to return all possible number of ways.
	 */
	/* Sample Input 1       Sample Output 1
	 * 4                    7
	 */
	public static int findWays(int n)
	{
		if(n < 0)
		{
			return 0;
		}	

		if(n == 0)
			return 1;

		return findWays(n-1)+ findWays(n-2)+findWays(n-3);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of steps(<30): ");
		int n = s.nextInt();
		s.close();
		System.out.println(findWays(n));
	}

}
