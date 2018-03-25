package test2;

import java.util.Scanner;

public class ArrayEquilibriumIndex {

	public static int arrayEquilibrium(int[] arr){  
		int rightSum = 0, leftSum = 0;
		
		// Sum of all elements
		for (int i = 0; i < arr.length; i++)
			rightSum += arr[i];

		// Gradually subtract from rightSum and add in leftSum for index i
		for (int i = 0; i < arr.length; i++) {
			rightSum -= arr[i];
			if (leftSum == rightSum)
				return i;
			leftSum += arr[i];
		}
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
		scan.close();
		System.out.println(arrayEquilibrium(a));
	}

}
