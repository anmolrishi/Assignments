package strings;

import java.util.Scanner;
/*
 * Given a string, remove all the consecutive duplicates that are present in the given string. 
 * That means, if 'aaa' is present in the string then it should become 'a' in the output string.
 */
/* Sample Input 1   Sample Output 1
 * aabccbaa         abcba
 */
public class RemoveConsecutiveDuplicates {

	public static String removeConsecutiveDuplicates(String input)
	{
		// Write your code here

		input = input + " "; // Adding a space at the end of the word
		int l=input.length(); // Finding the length of the word
		String ans=""; // Variable to store the final result
		char ch1,ch2;

		for(int i=0; i<l-1; i++)
		{
			ch1=input.charAt(i); // Extracting the first character
			ch2=input.charAt(i+1); // Extracting the next character

			// Adding the first extracted character to the result if the current and the next characters are different

			if(ch1!=ch2)
			{
				ans = ans + ch1;
			}
		}
		return ans; // Printing the result
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		scan.close();
		String b = removeConsecutiveDuplicates(a);
		System.out.println(b);

	}

}
