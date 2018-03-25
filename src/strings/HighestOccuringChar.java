package strings;

import java.util.Scanner;
/*
 * Given a string, find and return the highest occurring character present in the given string.
If there are 2 characters in the input string with same frequency, return the character which 
comes first. Note : Assume all the characters in the given string are lower case.
 */

/* Sample Input 1   Sample Output 1
 * aaabbbbbcccdde   b
 */
/* Sample Input 2   Sample Output 2
 * xy               x
 */

public class HighestOccuringChar {

	public static char highestOccuringCharacter(String inputString) {
		// Write your code here
		int characterCount = 0;
		int maxCharacter = 0;
		char maxCharacterChar = '.';

		char[] cArray = inputString.toCharArray();

		for(int i =0; i < cArray.length; i++)
		{
			int characterASCII = (int)cArray[i];
			characterCount = 0;

			//System.out.print("Character ASCII: " + characterASCII + "\n");
			for(int x = 0; x < cArray.length; x++)
			{
				if(characterASCII == (int)cArray[x])
				{
					characterCount ++;
					//System.out.print("Character Count for " + characterASCII + " " +  characterCount  + "\n");
					if(characterCount > maxCharacter)
					{
						maxCharacter = characterCount;
						maxCharacterChar = cArray[i];
					}
				}
			}
		}
		return maxCharacterChar;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		scan.close();
		char b = highestOccuringCharacter(a);
		System.out.println(b);
	}

}
