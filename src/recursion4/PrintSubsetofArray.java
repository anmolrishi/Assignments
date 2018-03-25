package recursion4;

import java.util.Scanner;
/*
 * Given an integer array (of length n), find and print all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array.
But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print the subsets in different lines.
 */
/* Sample Input 1     
 * 3                       
   15 20 12 
 */
/* Sample Output 1
[] (this just represents an empty array, don't worry about the square brackets)
12 
20 
20 12 
15 
15 12 
15 20 
15 20 12 
 */
public class PrintSubsetofArray {

	public static void printSubsets1(int[] input, int[] outputSoFar)
	{
		if(input.length==0)
		{
			for(int i =0;i<outputSoFar.length;i++)
			{
				System.out.print(outputSoFar[i] + " ");
			}
			System.out.println();
			return;
		}

		int n=input.length;
		int[] smallInput = new int[n-1];

		for(int i=1;i<n;i++){
			smallInput[i-1]=input[i];
		}

		printSubsets1(smallInput,outputSoFar);

		int b[] = new int[outputSoFar.length+1];

		for(int i=0;i<outputSoFar.length;i++)
		{
			b[i]=outputSoFar[i];
		}
		b[outputSoFar.length]=input[0];
		printSubsets1(smallInput,b);

	}

	public static void printSubsets(int input[]) 
	{
		int[] outputSoFar={};
		printSubsets1(input, outputSoFar);

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
		printSubsets(a);

	}

}
