package recursion2;

import java.util.Scanner;
/*
 * Write a recursive function to convert a given string into the number it represents. 
 * That is input will be a numeric string that contains only numbers, you need to convert the 
 * string into corresponding integer and return the answer.
 */
/* Sample Input 1       Sample Output 1
 * 1234                 1234 
 */
/* Sample Input 2       Sample Output 2
 * 5657                 5657 
 */
public class StringtoInteger {

	public static int convertStringToInt(String input)
	{
		// Write your code here
		if(input.length() == 1)
		{
			return input.charAt(0) - '0';
		}

		int smallOutput = convertStringToInt(input.substring(0, input.length()-1));
		int lastDigit = input.charAt(input.length()-1) - '0';
		return smallOutput*10 + lastDigit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		scan.close();
		int b = convertStringToInt(a);
		System.out.println(b);
	}

}
