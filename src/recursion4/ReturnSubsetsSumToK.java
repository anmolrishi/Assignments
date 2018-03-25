package recursion4;

import java.util.Scanner;

/*
Given an array A and an integer K, return all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array.
But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
 */
/* Sample Input 1                    Sample Output 1
 * 9                                 3 3
   5 12 3 17 1 18 15 3 17            5 1
   6
 */
public class ReturnSubsetsSumToK {

	public static int[][] subsetsSumKHelper(int[] input, int beginIndex, int k)
	{
		if(beginIndex == input.length)
		{
			if(k == 0)
			{
				return new int[1][0];
			}
			else
			{
				return new int[0][0];
			}
		}

		int[][] smallOutput1 = subsetsSumKHelper(input, beginIndex+1, k);
		int[][] smallOutput2 = subsetsSumKHelper(input, beginIndex + 1,k - input[beginIndex]);
		int[][] output = new int[smallOutput1.length + smallOutput2.length][];
		int index = 0 ;
		for(int i = 0; i < smallOutput1.length; i++)
		{
			output[index++] = smallOutput1[i];
		}

		for(int i = 0; i < smallOutput2.length; i++)
		{
			output[index] = new int[smallOutput2[i].length+1];
			output[index][0] = input[beginIndex];
			for(int j = 0; j < smallOutput2[i].length; j++)
			{
				output[index][j+1] = smallOutput2[i][j];
			}
			index++;
		}	
		return output;
	}

	public static int[][] subsetsSumK(int input[], int k) 
	{
		return subsetsSumKHelper(input, 0, k);
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
		System.out.println("Enter the sum of subsets: ");
		int k = scan.nextInt();

		scan.close();
		int b[][]=subsetsSumK(a, k);
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.println(b[i][j]);
			}
		}
	}
}
