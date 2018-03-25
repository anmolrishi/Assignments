package strings;

import java.util.Scanner;

/*
 * Write a program to do basic string compression. For a character which is repeated more than 
 * once, replace consecutive duplicate occurrences with the count of repetitions e.g. if a String
 * has 'x' repeated 5 times, replace this "xxxxx" with "x5".
 * Note : You don't need to print the changed string.
 */
/* Sample Input 1   Sample Output 1
 * aaabbccds        a3b2c2ds
 */

public class CompressString {


	public static String compress(String inputString) {
		// Write your code here
		int count = 1;
		StringBuilder builder = new StringBuilder();

		for(int i = 1; i<inputString.length(); i++)
		{

			if(inputString.charAt(i) == inputString.charAt(i-1) && i < inputString.length()-1)
			{
				count++;
			}

			// case when the last letter is in the sequence preceding it. Add that sequence to the compressed string
			else if(i == inputString.length()-1 && inputString.charAt(i) == inputString.charAt(i-1))
			{
				count++;
				builder.append(inputString.charAt(i));
				if(count>1)
					builder.append(count);
			}

			// case where the last letter is NOT in the sequence preceding it. Add it to string.
			else if(i == inputString.length()-1 && inputString.charAt(i) != inputString.charAt(i-1))
			{
				builder.append(inputString.charAt(i-1));
				if(count>1)
					builder.append(count);

				builder.append(inputString.charAt(i));
				if(count>1)
					builder.append(count);
			}
			else
			{
				// appending the character and THEN appending the count works.
				builder.append(inputString.charAt(i-1));
				if(count>1)
					builder.append(count);
				count = 1;
			}

		}

		inputString = builder.toString();

		return inputString;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		scan.close();
		String b = compress(a);
		System.out.println(b);
	}

}
