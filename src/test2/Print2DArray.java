package test2;

import java.util.Scanner;

/*
 * Given a 2D integer array with n rows and m columns. 
 * Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
 */
public class Print2DArray {

	public static void print2DArray(int input[][]) 
	{
		int k = input.length;
		for(int i = 0; i < input.length; i++) 
		{
			for(int l = k-1; l >= 0; l--) 
			{
				for(int j = 0; j < input[i].length; j++) 
				{
					System.out.print(input[i][j] + " ");
				}
				System.out.println();
			}
			k--;
		}
	}

	public static int[][] takeinput2D()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter rows");
		int row= s.nextInt();
		System.out.println("Enter cols");
		int col= s.nextInt();
		int input[][]= new int[row][col];

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter element at "+i+"th row"+j+"th column");
				input[i][j]=s.nextInt();
			}
		}
		s.close();
		return input;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] input = takeinput2D();
		print2DArray(input);

	}
}
