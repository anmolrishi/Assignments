package recursion1;

import java.util.Scanner;
/*
 * Given k, find the geometric sum i.e.
   1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
 */

/* Sample Input 1     Sample Output 1
 * 3                  1.875
 */
public class GeometricSum {

	public static double findGeometricSum(int k)
	{
		// Write your code here
		if(k == 0) 
			return 1;

		else 
			return Math.pow(2,-k) + findGeometricSum(k-1);

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int a = s.nextInt();
		s.close();
		System.out.println(findGeometricSum(a));
	}

}
