package arrays1;
/*
 * You are given an integer array that contains only 0s and 1s. Write a function to sort this 
 * array. Find a solution which scans the array only once. Don't use extra array.
 * You need to change in the given array itself. So no need to return or print anything.
 */

/* Sample Input 1          Sample Output 1
 * 7                       0 0 0 1 1 1 1
   0 1 1 0 1 0 1 
 */

import java.util.Scanner;

public class Sort01 {

	public static void sortBinaryArray(int[] arr)
	{
		int size = arr.length;

		/* Initialize left and right indexes */
		int left = 0, right = size - 1;

		while (left < right) 
		{
			/* Increment left index while we see 0 at left */
			while (arr[left] == 0 && left < right)
				left++;

			/* Decrement right index while we see 1 at right */
			while (arr[right] == 1 && left < right)
				right--;

			/* If left is smaller than right then there is a 1 at left
               and a 0 at right.  Exchange arr[left] and arr[right]*/
			if (left < right) 
			{
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
		System.out.println("The Sorted Array is as follows:");
		for (int i=0;i<=arr.length-1;i++)
			System.out.print(arr[i]+" ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter How many elements ?");
		int n = scan.nextInt();

		int a[] = new int[n];

		System.out.println("Enter only 0s and 1s in the array: ");
		for (int i=0;i<=n-1;i++)

		{ 
			System.out.println("Enter element"+i+"");
			a[i]=scan.nextInt();
		}
		scan.close();
		sortBinaryArray(a);
	}

}
