package arrays1;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Given an integer array of size 2N + 1. In this given array, N numbers are present twice and 
 * one number is present only once in the array.
You need to find that number which is unique in the array.
Note : Given array will always contain odd number of elements.
 */
/* Sample Input 1          Sample Output 1
 * 7                       1
   2 3 1 6 3 6 2 
 */

public class FindUniqueElement {

	public static int findUnique(int[] arr)
	{

		int flag=0,num=0;

		Arrays.sort(arr);

		if(arr[0]!=arr[1])
			return arr[0];

		int size = arr.length;

		if(arr[size-1]!=arr[size-2])
			return arr[size-1];

		for (int i=1;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				num = arr[i];

				if(num==arr[i-1])
				{
					flag = 0;
				}
				else
				{
					flag =1;break;
				}
			}
		}
		if(flag==1)
			return num;
		else
			return -1;
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
		System.out.println(findUnique(a));
	}

}
