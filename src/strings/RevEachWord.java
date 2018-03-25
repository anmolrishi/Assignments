package strings;

import java.util.Scanner;
/*
 * Given a string, reverse each word of a string individually. For eg. if a string is "abc def", 
 * reversed string should be "cba fed".
 */
/*  Sample Input 1     
 *  Welcome to Coding Ninjas 
 */
/*  Sample Output 1
 *  emocleW ot gnidoC sajniN     
 */
public class RevEachWord {

	public static String reverseEachWord(String input) 
	{
		String output = "";
		for (String part : input.split(" ")) 
		{
			System.out.print(new StringBuilder(part).reverse().toString());
			System.out.print(" ");
		}

		
		return output;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		scan.close();
		String b = reverseEachWord(a);
		System.out.println(b);
	}

}
