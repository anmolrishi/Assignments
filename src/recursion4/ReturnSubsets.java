package recursion4;
/*
 * Given an integer array (of length n), find and return all the subsets of input array. 
Subsets are of length varying from 0 to n, that contain elements of the array.
But the order of elements should remain same as in the input array.
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
import java.util.Scanner;

public class ReturnSubsets {

	public static int[][] subsets(int input[]) 
	{
		if(input.length==0)
		{
			int a[][] = {{}};
			return a;
		}

		int n=input.length;
		int[] smallInput = new int[n-1];

		for(int i=1;i<n;i++)                   // substring's work done 
		{
			smallInput[i-1]=input[i];
		}



		int[][] smallAns = subsets(smallInput);

		int[][] a = new int[2*smallAns.length][];

		for (int i = 0; i<smallAns.length; i++)
		{
			a[i]= new int[smallAns[i].length];
			
			for(int j=0;j<smallAns[i].length;j++)
			{
				a[i][j] = smallAns[i][j];	
			}

		}


		for (int i = 0; i<smallAns.length; i++)
		{   a[i+smallAns.length]= new int[smallAns[i].length+1];
			a[i+smallAns.length][0] = input[0];

			for(int j=1;j<smallAns[i].length+1;j++)
			{							
				
				a[i+smallAns.length][j] = smallAns[i][j-1];	
			}

		}

		return a;

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
		int b[][]=subsets(a);
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.println(b[i][j]);
			}
		}
		}
	}

