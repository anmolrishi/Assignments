package arrays2;

import java.util.Scanner;
/*
 * Given a random integer array of size n, write a function that rotates the given array by d 
 * elements (towards left)
 * Change in the input array itself. You don't need to return or print elements.
 */
/* Sample Input 1          Sample Output 1
 * 7                       3 4 5 6 7 1 2
   1 2 3 4 5 6 7
   2
 */

public class RotateArray {

	public static void rotate(int[] arr, int index)
	{
		int i,n=arr.length;
		
		for (i = 0; i < index; i++)
		{
			int j,temp;
			temp = arr[0];
			for (j = 0; j < n - 1; j++)
				arr[j] = arr[j + 1];
			arr[j] = temp;
		}
		System.out.println("The Updated Array is as follows:");
		for (i=0;i<=arr.length-1;i++)
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
		System.out.println("Enter the index for rotation: ");
		int index = scan.nextInt();
		scan.close();
		rotate(a, index);
	}

}
