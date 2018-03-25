package recursion2;

import java.util.Scanner;
/*
 * Given a string, compute recursively a new string where all 'x' chars have been removed.
 */
/* Sample Input 1     Sample Output 1
 * xaxb               ab
 */
/* Sample Input 2     Sample Output 2
 * abc                abc
 */
/* Sample Input 3     Sample Output 3
 * xx                 
 */
public class RemoveX {

	public static String removeX(String input)
	{
		// Write your code here
		char ch;
		if(input.length() == 0)
			return input;
		ch = input.charAt(0);
		if(ch == 'x')
			return removeX(input.substring(1));
		return ch + removeX(input.substring(1));
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		scan.close();
		String b = removeX(a);
		System.out.println(b);
	}

}
