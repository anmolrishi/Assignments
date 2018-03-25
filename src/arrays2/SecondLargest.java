package arrays2;

import java.util.Scanner;
/*
 * Given a random integer array of size n, find and return the second largest element present in 
 * the array.
 * If n <= 1, return -Infinity
 */
/* Sample Input 1          Sample Output 1
 * 7                       13
   2 13 4 1 3 6 28
 */
/* Sample Input 2          Sample Output 2
 * 5                       6
   9 3 6 2 0 
 */
public class SecondLargest {

	public static int secondLargestElement(int[] arr) {
		//write your code here
		int i, first, second,arr_size = arr.length;

		/* There should be at least two elements */
		if (arr_size < 2)
		{
			return -1;
		}

		first = second = Integer.MIN_VALUE;
		for (i = 0; i < arr_size ; i ++)
		{
			/* If current element is smaller than first then update both
          first and second */
			if (arr[i] > first)
			{
				second = first;
				first = arr[i];
			}

			/* If arr[i] is in between first and second then update second  */
			else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}
		if (second == Integer.MAX_VALUE)
			return -1;
		else
			return second;
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
		System.out.println(secondLargestElement(a));
	}

}
