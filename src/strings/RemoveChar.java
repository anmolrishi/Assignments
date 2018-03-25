package strings;

import java.util.Scanner;
/*
 * Given a string and a character x. Write a function to remove all occurrences of x character 
 * from the given string.
 */
/* Sample Input 1             Sample Output 1
 * welcome to coding ninjas   welcme t cding ninjas
 * o 
 */
public class RemoveChar {

	public static String removeAllOccurrencesOfChar(String input, char c) 
	{
		String output = "";	    
		String use = Character.toString(c);
		output = input.replaceAll(use,"");
		return output;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();

		System.out.println("Enter character to be removed");
		char ch = scan.next().charAt(0);

		scan.close();

		String b = removeAllOccurrencesOfChar(a, ch);

		System.out.println(b);
	}

}
