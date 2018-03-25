package recursion3;
/*
 * Sort an array using Merge Sort. 
 * Change in the input array itself. So no need to return pr print anything.
 */
/* Sample Input 1          Sample Output 1
 * 7                       1 2 3 4 6 13 28
   2 13 4 1 3 6 28
 */
/* Sample Input 2          Sample Output 2
 * 5                       0 2 3 6 9
   9 3 6 2 0
 */
import java.util.Scanner;

public class MergeSort {
	public static  int[] merge(int[] input1, int[] input2, int[] output)
	{

		int i = 0, j = 0, k = 0;
		while(i < input1.length && j < input2.length)
		{
			if(input1[i] < input2[j])
			{
				output[k] = input1[i];
				i++;
				k++;
			}
			else
			{
				output[k] = input2[j];
				k++;
				j++;
			}
		}

		while(i < input1.length)
		{
			output[k++] = input1[i++];
		}

		while(j < input2.length)
		{
			output[k++] = input2[j++];
		}
		return output;
	}

	public static int[] mergeSort(int[] input)
	{
		// Write your code here
		if(input.length <= 1)
		{
			return null;
		}

		int mid = input.length / 2;
		int part1[] = new int[mid];
		int part2[] = new int[input.length - mid];

		for(int i = 0; i < part1.length; i++)
		{
			part1[i] = input[i];
			//			k++;
		}
		for(int i = 0; i < part2.length; i++ )
		{
			part2[i] = input[mid + i];
		}
		mergeSort(part1);
		mergeSort(part2);
		int output[]=merge(part1, part2, input);
		return output;
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
		int output[]=mergeSort(a);

		System.out.println("The Sorted Array is as follows:");
		for (int i=0;i<=output.length-1;i++)
			System.out.print(output[i]+" ");

	}

}
