package recursion1;

import java.util.Scanner;
/*
 * Check if a given String is palindrome or not (using recursion). Return true or false.
 */
/*  Sample Input 1     Sample Output 1
 *  racecar            true
 */
/*  Sample Input 2     Sample Output 2
 *  ninja              false
    
 */
public class CheckPalindrome {

	public static boolean isStringPalindrome(String input) 
	{
		// Write your code here

		if(input.length() == 0 || input.length() == 1)
			return true; 

		if(input.charAt(0) == input.charAt(input.length()-1))
			return isStringPalindrome(input.substring(1, input.length()-1));

		return false;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String a = scan.nextLine();
		scan.close();
		System.out.println(isStringPalindrome(a));
	}

}
