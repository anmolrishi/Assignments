package arrays1;
/*
 * Given a random integer array and a number x. Find and print the triplets of elements in the
array which sum to x. While printing a triplet, print the smallest element first.
That is, if a valid triplet is (6, 5, 10) print "5 6 10". There is no constraint that out of 5 
triplets which have to be printed on 1st line.You can print triplets in any order, just be 
careful about the order of elements in a triplet.
 */
/* Sample Input 1          Sample Output 1
 * 7                       1 4 7
   1 2 3 4 5 6 7           1 5 6
   12                      2 3 7
                           2 4 6
                           3 4 5
 */
import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {

	public static void FindTriplet(int[] arr, int num){
		//write your code here

		Arrays.sort(arr);

		// Consider all possible triplets and check their sums
		for (int i = 0; i < arr.length; i++)
		{ 
			for (int j = i + 1; j < arr.length; j++)
			{ 
				for (int k = j + 1; k < arr.length; k++)
				{ 
					if ((arr[i] + arr[j] + arr[k]) == num)
					{ 
						System.out.print(arr[i]);

						System.out.print(" ");

						System.out.print(arr[j]);

						System.out.print(" ");

						System.out.println(arr[k]);
					}
				}
			}
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
		System.out.println("Enter the sum of pairs: ");
		int num = scan.nextInt();
		scan.close();

		FindTriplet(a, num);
	}

}
