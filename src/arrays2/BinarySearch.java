package arrays2;

import java.util.Scanner;
/*
 * Given a sorted integer array (in ascending order) and an element x. You need to search this
 * element x in the given input array using binary search. Return the index of element in the 
 * input. Indexing starts from 0. Return -1 if x is not present in the input array.
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
public class BinarySearch {

	public static int binarySearch(int[] arr, int num)
	{

		int n = arr.length;

		int pos=-1,beg=0,end=n-1,mid=(beg+end)/2;

		while(beg<=end && arr[mid]!=num)

		{ 
			if (arr[mid]>num)
				end=mid-1;
			else
				beg=mid +1;
			mid=(beg+end)/2; 
		}


		if (arr[mid]==num)
		{
			pos=mid;
			return pos;
		}

		else
			return -1;
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
		System.out.println(binarySearch(a, num));
	}

}
