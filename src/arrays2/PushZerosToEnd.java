package arrays2;

import java.util.Scanner;
/*
 * Given a random integer array, push all the zeros that are present to end of the array. 
 * The consecutive order of other elements should remain same.
 * Change in the input array itself. You don't need to return or print elements.
 */
/* Sample Input 1          Sample Output 1
 * 7                       2 4 1 3 28 0 0
   2 0 4 1 3 0 28
 */
/* Sample Input 2          Sample Output 2
 * 5                       3 2 0 0 0 
   0 3 0 2 0
 */
public class PushZerosToEnd {

	public static void pushZerosAtEnd(int[] arr)
	{

		int n = arr.length;
		int count = 0;  // Count of non-zero elements

		/*
        Traverse the array. If element encountered is
        non-zero, then replace the element at index 'count'
        with this element
		 */

		for (int i = 0; i < n; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i]; // here count is incremented

		/*
		 Now all non-zero elements have been shifted to
		 front and 'count' is set as index of first 0.
		 Make all elements 0 from count to end.
		 */

		while (count < n)
			arr[count++] = 0;
		
		System.out.println("The Updated Array is as follows:");
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
		pushZerosAtEnd(a);
	}

}
