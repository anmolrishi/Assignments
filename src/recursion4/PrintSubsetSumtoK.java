package recursion4;

import java.util.Scanner;
/*
 * Given an array A and an integer K, print all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. 
But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print them in different lines.
 */
/* Sample Input 1                    Sample Output 1
 * 9                                 3 3
   5 12 3 17 1 18 15 3 17            5 1
   6
 */
public class PrintSubsetSumtoK {

	public static void printSubsets1(int[] input, int[] outputSoFar,int sum){
		if(input.length==0)
		{int s=0;
		for(int i=0;i<outputSoFar.length;i++)
		{	
			if(s>sum)
			{
				return;
			}
			s+=outputSoFar[i];
		}
		if(s==sum)
		{
			for(int i =0;i<outputSoFar.length;i++)
			{
				System.out.print(outputSoFar[i] + " ");
			}
			System.out.println();
		}
		return;
		}

		int n=input.length;
		int[] smallInput = new int[n-1];

		for(int i=1;i<n;i++){
			smallInput[i-1]=input[i];
		}

		printSubsets1(smallInput,outputSoFar,sum);

		int b[] = new int[outputSoFar.length+1];

		for(int i=0;i<outputSoFar.length;i++)
		{
			b[i]=outputSoFar[i];
		}
		b[outputSoFar.length]=input[0];
		printSubsets1(smallInput,b,sum);

	}
	public static void printSubsetsSumTok(int input[], int k) {
		int[] outputSoFar={};
		printSubsets1(input, outputSoFar,k);
	}

	public static void main(String[] args) {
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
		printSubsetsSumTok(a, k);

	}

}
