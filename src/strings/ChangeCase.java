package strings;

import java.util.Scanner;
/*
 * Write a function that converts a given string to lower case.
 * Assume, given string contains upper case alphabets only. But input can contain multiple words.
 */
/* Sample Input 1       Sample Output 1
 * ABCDE                abcde 
 */
/* Sample Input 2       Sample Output 2
 * ABC DEF              abc def 
 */
public class ChangeCase {

	public static String toLowercase(String inputString)
	{
		String output = "";
		System.out.println(inputString.toLowerCase());
		return output;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		scan.close();
		String b = toLowercase(a);
		System.out.println(b);
	}

}
