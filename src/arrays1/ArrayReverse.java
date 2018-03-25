package arrays1;

import java.util.Scanner;
/*
 * An integer array is given. You need to reverse that array without using any other extra array. 
 * That is, you need to change in the given array itself.
 * No need to return or print anything. You just need to reverse the given array.
 */

/* Sample Input 1          Sample Output 1
 * 5                       5 4 3 2 1
   1 2 3 4 5 
 */
public class ArrayReverse {

	public static void arrayReverse(int[] arr)

	{
		int n = arr.length;

		int temp,i;

		for (i = 0; i < n/2; i++) 
		{
			temp = arr[i];

			arr[i] = arr[n-1-i];

			arr[n-1-i] = temp;
		}

		System.out.println("The Reversed Array is as follows:");
		for (i=0;i<=n-1;i++)
			System.out.print(arr[i]+" ");
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
		arrayReverse(a);
	}

}
