package arrays2;

import java.util.Scanner;
/*
 * Given an array of integers of size n which contains numbers from 0 to n - 2. Each number is
 *  present at least once. That is, if n = 5, numbers from 0 to 3 is present in the given array 
 *  at least once and one number is present twice. You need to find and return that duplicate 
 *  number present in the array.
 */
/* Sample Input 1          Sample Output 1
 * 9                       7
   0 7 2 5 4 7 1 3 6
 */
public class DuplicateInArray {

	public static int duplicate(int[] arr)
	{  
		
		int size = arr.length,num=0,flag=0;
		int count[] = new int[size];
		int i;

		//  System.out.println("Repeated elements are : ");
		for (i = 0; i < size; i++) 
		{
			if (count[arr[i]] == 1)
			{ flag =1; num =arr[i]; }
			else
				count[arr[i]]++;
		}
		if (flag==1)
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
		System.out.println(duplicate(a));
	}
}


