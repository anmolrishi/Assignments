package arrays2;

import java.util.Scanner;
/*
 * Given a random integer array. Sort this array using bubble sort.
 * Change in the input array itself. You don't need to return or print elements.
 */
/* Sample Input 1          Sample Output 1
 * 7                       1 2 3 4 6 13 28
   2 13 4 1 3 6 28
 */
/* Sample Input 2          Sample Output 2
 * 5                       0 2 3 6 9
   9 3 6 2 0
 */
public class BubbleSort {

	public static void bubbleSort(int[] arr)
	{

		int temp=0;

		for(int i=0;i<arr.length-1;i++) // total no. of passes = n-1
		{
			for(int j=0;j<arr.length-i-1;j++) // work done in one general pass
			{
				if(arr[j]>arr[j+1])    
				{	
					temp = arr[j];
					arr[j] = arr[j+1];      // swap the 2 elements
					arr[j+1]= temp;
				}
			}
		}
		System.out.println("The Sorted Array is as follows:");
		for (int i=0;i<=arr.length-1;i++)
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
		bubbleSort(a);
	}

}


