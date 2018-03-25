package arrays1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Given a random integer array and a number x. Find and print the pairs of elements in the array 
 * which sum to x. While printing a pair, print the smaller element first. That is, if a valid 
 * pair is (6, 5) print "5 6". There is no constraint that out of 5 pairs which have to be printed
 * on 1st line. You can print pairs in any order, just be careful about the order of elements in
 * a pair.
 */
/* Sample Input 1          Sample Output 1
 * 9                       1 6
   1 3 6 2 5 4 3 2 4       3 4
   7                       3 4
                           2 5
                           2 5
                           3 4
                           3 4
 */
public class PairSumInArray {

	//arr is the given array of which you need to find the pairs which sum to num
	public static void pairSum(int[] arr, int num)
	{
		Arrays.sort(arr);

		// Consider all possible pairs and check their sums

		for (int i = 0; i < arr.length; i++)
		{ 
			for (int j = i + 1; j < arr.length; j++)
			{ 
				if ((arr[i] + arr[j]) == num)
				{ 
					System.out.print(arr[i]);

					System.out.print(" ");

					System.out.println(arr[j]);
				}
			}
		}
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
		System.out.println("Enter the sum of pairs: ");
		int num = scan.nextInt();
		scan.close();

		pairSum(a, num);
	}
}
