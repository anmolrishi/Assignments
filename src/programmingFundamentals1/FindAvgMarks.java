package programmingFundamentals1;

/*
 * Write a program to input name (as a single character) and marks of three tests of a student 
 * (all integers).Then calculate and print the name and average (integer) of best two test marks.
 
 * All the test marks are integers and calculate average also as integer. 
 * That is, you need to print the integer part of average only, neglect the decimal part.
 */

/*   Sample Input 1          Sample Output 1 
     a                       a 234
     345 123 10
 */

/*   Sample Input 2          Sample Output 2 
 *   b                       b 33
     23 12 44
 */

import java.util.Scanner;
public class FindAvgMarks {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter name as a single character"); 
		String name = scan.next();

		System.out.println("Enter marks in subject 1: ");
		int sub1 = scan.nextInt();

		System.out.println("Enter marks in subject 2: ");
		int sub2 = scan.nextInt();

		System.out.println("Enter marks in subject 3: ");
		int sub3 = scan.nextInt();

		int sum=0;

		scan.close();

		if(sub1>=sub2 && sub3>=sub2)
		{
			sum = sub1+sub3;
		}
		else if (sub1>=sub3 && sub2>=sub3)
		{
			sum = sub1+sub2;
		}
		else
		{
			sum = sub2+sub3;    
		}

		double avg1 = (sum/2);
		int avg = (int)Math.round(avg1);

		// displaying  name and average
		System.out.println("Name and Average are as follows: ");
		System.out.print((name.charAt(0))+" "+avg);

	}

}
