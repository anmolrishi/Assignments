package arrays2;

import java.util.Scanner;
/*
 * Given an integer array, which is sorted (in increasing order) and has been rotated by some
 * number k in clockwise direction. Find and return the k.
 */
/* Sample Input 1          Sample Output 1
 * 6                       2
   5 6 1 2 3 4
 */
/* Sample Input 2          Sample Output 2
 * 5                       0
   3 6 8 9 10 
 */
public class CheckArrayRotation {

	public static int arrayRotateCheck(int[] arr)
	{

		int n = arr.length;
		boolean isInc = true;
		int prev = arr[0];
		int current;
		int i=1;
		while(i<n)
		{
			current = arr[i];
			if(isInc)
			{
				if(current<prev)
				{
					isInc=false; return i;
				}
			}

			i++; prev = current;

		}
		return 0;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter How many elements ?");
		int n = scan.nextInt();

		int a[] = new int[n];

		for (int i=0;i<=n-1;i++)

		{ 
			System.out.println("Enter element"+i+"");
			a[i]=scan.nextInt();
		}
		scan.close();
		System.out.println(arrayRotateCheck(a));
	}
}

