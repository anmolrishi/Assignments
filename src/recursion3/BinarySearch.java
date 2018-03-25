package recursion3;

import java.util.Scanner;
/*
 * Given an integer sorted array (sorted in increasing order) and an element x, find the x in given
 *  array using binary search. Return the index of x.
 *   Return -1 if x is not present in the given array.
 */
/* Sample Input 1          Sample Output 1
 * 7                       4
   2 13 4 1 3 6 28
   3
 */
public class BinarySearch {

	public static int BinarySearchr(int[ ] a, int x, int low, int high) 
	{
		if (low > high) return -1; 
		int mid = (low + high)/2;
		if (a[mid] == x) return mid;
		else if (a[mid] < x)
			return BinarySearchr(a, x, mid+1, high);
		else // last possibility: a[mid] > x
			return BinarySearchr(a, x, low, mid-1);
	}

	// element - number to be searched
	public static int binarySearch(int input[], int element) 
	{
		// Write your code here
		return BinarySearchr(input, element, 0, input.length - 1);
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
		System.out.println("Enter the number to be searched: ");
		int num = scan.nextInt();

		scan.close();
		System.out.println(binarySearch(a, num));
	}

}
