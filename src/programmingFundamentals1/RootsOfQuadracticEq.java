package programmingFundamentals1;

import java.util.Scanner;
/*
 * Write a program to calculate the roots of a given quadratic equation - a(x^2) + bx + c = 0
 */
/*
 * Print roots specifying their nature. If roots are imaginary, no need to print the roots.
 * Print the nature of roots in the form of an integer -
 *   0 : if roots are real & same
 *   1 : if roots are real & different
 *  -1 : if roots are imaginary
 */
 
 /* Sample Input 1       Sample Output 1 
 * 1 4 2                 1
                        -1 -3
 */

 /* Sample Input 2       Sample Output 2 
 * 1 2 3                -1
 */

public class RootsOfQuadracticEq {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value of a, b and c");

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		scanner.close();
		
		double r1a = 0;
		double r2a = 0;

		double discriminant = b * b - 4 * a * c;

		if (discriminant > 0)
		{
			r1a = (-b + Math.sqrt(discriminant)) / (2 * a);
			r2a = (-b - Math.sqrt(discriminant)) / (2 * a);

			int r1 = (int)Math.round(r1a);
			int r2 = (int)Math.round(r2a);
			System.out.println("1");
			System.out.print(r1);
			System.out.print(" ");
			System.out.print(r2);
		}


		if (discriminant == 0)
		{
			r1a = -b / (2 * a);
			r2a = -b / (2 * a);
			int r1 = (int)Math.round(r1a);
			int r2 = (int)Math.round(r2a);
			System.out.println("0");
			System.out.print(r1);
			System.out.print(" ");
			System.out.print(r2);
		}

		if (discriminant < 0)
		{

			System.out.println("-1");
		}
	}

}
