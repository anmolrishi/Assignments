package stacks_queues;

import java.util.Scanner;
import java.util.Stack;
/*
 * The span si of a stock’s price on a certain day i is the minimum number of consecutive days 
 * (up to the current day) the price of the stock has been less than or equal to its price on that
 *  ith day. If for a particular day, if no stock price is greater then just count the number of 
 *  days till 0th day including current day.
 */
/*
 Given an input array with all stock prices, you need to return the array with corresponding spans 
 of each day.
 */
/* Sample Input 1                  Sample Output 1
 * 8                               1 2 3 4 1 1 2 8
   60 70 80 100 90 75 80 120
 */
public class StockSpan {

	public static int[] stockSpan(int[]price)
	{
		int[]span = new int[price.length];

		//The stack stores last day with a stock greater than this day 
		Stack<Integer>days = new Stack<Integer>();

		days.push(0);
		span[0] = 1;

		for(int i = 1 ; i < price.length ; i++)
		{

			while(!days.isEmpty() && (price[days.peek()]<price[i]))
			{
				days.pop();
			}

			if(!days.isEmpty())
				span[i] = i - days.peek();
			else
				span[i] = i+1;
			days.push(i);

		}

		return span;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the price array: ");
		System.out.println("Enter How many elements ?");
		int n = scan.nextInt();

		int a[] = new int[n];

		for (int i=0;i<=n-1;i++)

		{ 
			System.out.println("Enter element"+i+"");
			a[i]=scan.nextInt();
		}
		scan.close();
		int [] span = stockSpan(a);
		for(int i=0;i<span.length;i++)
		{
			System.out.print(span[i]+" ");
		}
	}

}
