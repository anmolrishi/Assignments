package programmingFundamentals1;

import java.util.Scanner;
/*
 * Write a program to calculate the total salary of a person. The user has to enter the basic 
 * and the grade and depending upon which the total salary is calculated as -
 *  t_sal = basic + hra + da + allow – pf where:-
 *  hra   = 20% of basic
 *  da    = 50% of basic
 *  allow = 1700 if grade = ‘A’
 *  allow = 1500 if grade = ‘B’
 *  allow = 1300 if grade = ‘C' or any other character
 *  pf    = 11% of basic.
 */

/* Sample Input 1        Sample Output 1 
 * 10000 A               17600
 */
/* Sample Input 2        Sample Output 2
 * 4567 B                8762
 */

public class TotalSalary {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the basic salary: ");
		double basic = sc.nextDouble();

		System.out.println("Enter the grade: ");
		char m = sc.next().charAt(0);

		sc.close();

		double hra = basic/5, da = basic/2, pf = 0.11*basic, allow=0.0;

		if(m==65)
		{
			allow=1700.0;
		}
		else if (m==66)
		{
			allow=1500.0;
		}
		else
		{
			allow=1300.0;
		}

		double  t_sal1 = basic + hra + da + allow - pf;
		int t_sal = (int)Math.round(t_sal1);
		System.out.println("Total salary is as follows: ");
		System.out.print(t_sal);
	}

}
