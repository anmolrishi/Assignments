package recursion4;

import java.util.Scanner;
/*
 * Given a string, find and print all the possible permutations of the input string.
Note : The order of permutations are not important. Just print them in different lines.
 */
/* Sample Input 1       Sample Output 1
 * abc                  abc
                        acb
                        bac
                        bca
                        cab
                        cba
 */
public class PrintPermutations 
{
	public static void permuteString(String beginningString, String endingString) {
		if (endingString.length() <= 1)
			System.out.println(beginningString + endingString);
		else
			for (int i = 0; i < endingString.length(); i++) {
				try {
					String newString = endingString.substring(0, i) + endingString.substring(i + 1);

					permuteString(beginningString + endingString.charAt(i), newString);
				} catch (StringIndexOutOfBoundsException exception) {
					exception.printStackTrace();
				}
			}
	}
	public static void permutations(String input)
	{
		// Write your code here
		permuteString("", input);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of the keypad: ");
		String n = s.next();
		s.close();
		permutations(n);
	}

}
