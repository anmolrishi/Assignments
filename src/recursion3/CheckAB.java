package recursion3;

import java.util.Scanner;
/*  Suppose you have a string made up of only 'a' and 'b'. Write a recursive function that checks if
 *  the string was generated using the following rules:
a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false.
 */
/* Sample Input 1      Sample Output 1
 * abb                 true
 */
public class CheckAB {

	public static boolean check(String checkString) 
	{
		if(checkString.length()<=2)
		{
			return true;  //base case
		}

		if(checkString.charAt(0)=='a')

		{
			if(checkString.charAt(1)=='a' || checkString.charAt(1)==' ')
			{
				return check(checkString.substring(1));
			}

			else if (checkString.charAt(1)=='b' && checkString.charAt(2)=='b')
			{
				return check(checkString.substring(1));
			}

			else return false;
		}


		if(checkString.charAt(0)=='b' && checkString.charAt(1)=='b')
		{
			if(checkString.charAt(2)=='a' || checkString.charAt(2)==' ')
			{
				return check(checkString.substring(2));
			}
			else return false;
		}
		return false;
	}

	public static boolean checkStringWithAandB(String input){


		if(input.charAt(0) == 'a')
		{
			return check(input.substring(1));
		}
		else return false;

	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		scan.close();
		System.out.println(checkStringWithAandB(a));
	}

}
