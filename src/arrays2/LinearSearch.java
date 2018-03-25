package arrays2;

import java.util.Scanner;
/*
 * Given a random integer array and an element x. You need to search this element x in the given
 * input array using linear search. Return the index of element in the input.
 * Indexing starts from 0.
 * Return -1 if x is not present in the input array.
 */
/* Sample Input 1          Sample Output 1
 * 7                       4
   2 13 4 1 3 6 28
   3
 */
/* Sample Input 2          Sample Output 2
 * 7                       -1
   2 13 4 1 3 6 28
   9
 */
public class LinearSearch {

	public static int linearSearch(int[] arr, int num)
	{

		int n = arr.length,i=0;

		for (i = 0; i < n; i++)
		{
			if (arr[i] == num)     /* Searching element is present */
			{
				break;
			}
		}

		if (i == n)  /* Searching element is absent */
			return -1;
		else
		{
			return i;
		}
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
		System.out.println("Enter the number to be searched: ");
		int num = scan.nextInt();

		scan.close();
		System.out.println(linearSearch(a, num));
	}

}
