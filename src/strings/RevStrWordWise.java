package strings;

import java.util.Scanner;
/*
 * Reverse the given string word wise. That is, the last word in given string should come at 1st
 * place, last second word at 2nd place and so on. Individual words should remain as it is.
 */
/* Sample Input 1                   Sample Output 1
 * Welcome to Coding Ninjas         Ninjas Coding to Welcome
 */
public class RevStrWordWise 
{

	public static String reverseWordWise(String input) 
	{
		// Write your code here
		if (input == null || input.length() == 0) 
		{
			return "";
		}

		// split to words by space
		String[] arr = input.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = arr.length - 1; i >= 0; --i) 
		{
			if (!arr[i].equals("")) 
			{
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		scan.close();
		String b = reverseWordWise(a);
		System.out.println(b);
	}

}
