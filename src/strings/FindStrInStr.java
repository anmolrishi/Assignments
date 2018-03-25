package strings;

import java.util.Scanner;
/*
 * Given two strings S and T, write a function to find if T is present as a substring inside S or 
 * not. If yes, return the starting index otherwise return -1.
 */
/* Sample Input 1       Sample Output 1
 * WelcomeBack          3
   come 
 */
/* Sample Input 2       Sample Output 2
 * WelcomeBack          -1
   code
 */
public class FindStrInStr {

	public static int findString(String text, String pattern) 
	{

		int index = text.indexOf(pattern);
		return index;

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String a = scan.nextLine();
		System.out.println("Enter second String: ");
		String b = scan.nextLine();
		scan.close();
		System.out.println(findString(a, b));
	}

}
