package arrays1;

import java.util.Scanner;
/*
 * Two random integer arrays are given, in which numbers from 0 to 9 are present at every index 
 * (i.e. single digit integer is present at every index of both given arrays). You need to find 
 * sum of both the input arrays and put the result in another array i.e. output array.
The size of both input arrays can be different. No need to print the elements of output array.
Note : Output array size should be 1 more than the size of bigger array and place 0 at the 0th
index if there is no carry.
 */
/* Sample Input 1      Sample Output 1
 * 3                   1 3 8 0
   6 2 4
   3
   7 5 6
 */
/* Sample Input 2      Sample Output 2
 * 3                   0 8 6 5
   8 5 2
   2
   1 3
 */
public class Sumof2Arrays {

	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
		//write your code here
		int size1=arr1.length;
		int size2=arr2.length;
		int size3=0;
		
		if(size1>=size2)
		{ size3 = size1+1; }
		
		else 
		size3=size2+1;
		
		int arr3[] = new int[size3];
		
		int k=size3-1, i= size1-1,j=size2-1,sum=0;
		
		while(j>=0 && i>=0)
		{
		    sum+=arr1[i]+arr2[j];
		    arr3[k]=sum%10;
		    k--;
		    sum/=10;i--;j--;
		}
	 
		
	if(i>j){
	    for(int p=i;p>=0;p--){
	       if(sum==1)
	        {arr3[k]=arr1[p]+sum;
	        sum--;
	        k--;}
	        else{
	        arr3[k]=arr1[p];
	        k--;  
	        }
	    }
	}
	else if(j>i){
	    for(int p=j;p>=0;p--){
	        if(sum==1)
	        {arr3[k]=arr2[p]+sum;
	        sum--;
	        k--;}
	        else{
	        arr3[k]=arr2[p];
	        k--;  
	        }
	    }
	}
	else{
	    arr3[k]=sum;k--;
	}
		
		return arr3;
	}
	public static void main(String[] args) {
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
		
		int arr3[] = sumOfTwoArrays(a, b);
		System.out.println("The Sum Array is as follows:");
		for (int i=0;i<=arr3.length-1;i++)
			System.out.print(arr3[i]+" ");

	}

}
