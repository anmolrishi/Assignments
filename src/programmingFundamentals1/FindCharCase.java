package programmingFundamentals1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
/*
 * Write a program to determine whether the entered character is in upper case or lower case, 
 * or is an invalid character.
 */

/*
 *  1 for upper case
    0 for lower case 
   -1 for any other character (special characters or others)
 */
/* 
 * Sample Input 1    Sample Input 2    Sample Input 3 
 *  v                 V                  #
 *  0 (O)             1 (O)             -1 (O)
 */
public class FindCharCase {

	public static void main(String[] args) throws IOException {

		char m;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a character: ");
		m = (char) bf.read();
		
		if(m >= 97 && m <= 123)
		{
			System.out.println("0");
		}
		else if(m >= 65 && m <= 96)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("-1");
		}
	}
}
