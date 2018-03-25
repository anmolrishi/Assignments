package arrays1;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Given two random integer arrays, print their intersection. That is print all the elements that
 * are present in both the given arrays. Note : Order of elements are not important
 */
/* Sample Input 1          Sample Output 1
 * 6                       2
   2 6 8 5 4 3             4
   4                       3
   2 3 4 7
 */
public class PrintArrayIntersection {

	public static void intersection(int[] arr1, int[] arr2)
	{

		int i = 0, j = 0;

		int m = arr1.length;
		int n = arr2.length;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		while (i < m && j < n)
		{
			if (arr1[i] < arr2[j])
				i++;
			else if (arr2[j] < arr1[i])
				j++;
			else
			{
				System.out.println(arr2[j++]);
				i++;
			}
		}

	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter How many elements for array 1?");
		int n = scan.nextInt();

		int a[] = new int[n];

		for (int i=0;i<=n-1;i++)

		{ 
			System.out.println("Enter element"+i+"");
			a[i]=scan.nextInt();
		}

		System.out.println("Enter How many elements for array 2?");
		int m = scan.nextInt();

		int b[] = new int[m];

		for (int i=0;i<=m-1;i++)

		{ 
			System.out.println("Enter element"+i+"");
			b[i]=scan.nextInt();
		}
		scan.close();
		intersection(a, b);
	}

}
