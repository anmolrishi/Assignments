package recursion2;

import java.util.Scanner;
/*
 * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have
 * been replaced by "3.14".
 */
/* Sample Input 1     Sample Output 1
 * xpix               x3.14x
 */
/* Sample Input 2     Sample Output 2
 * pipi               3.143.14
 */
/* Sample Input 3     Sample Output 3
 * pip                3.14p
 */
public class ReplacePi {

	public static String replace(String input) 
	{
		// Write your code here
		if(input.length() < 2)
			return input;
		if(input.substring(0, 2).equals("pi"))
			return "3.14" + replace(input.substring(2));
		return input.charAt(0) + replace(input.substring(1));

	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		scan.close();
		String b = replace(a);
		System.out.println(b);
	}

}
