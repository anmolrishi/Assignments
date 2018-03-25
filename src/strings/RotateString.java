package strings;

import java.util.Scanner;
/*
 * Given a string and an integer n, shift and rotate the given string by n characters in right.
 */
/* Sample Input 1     Sample Output 1
 * CodingNinjas       jasCodingNin
   3
 */
public class RotateString {

	public static String rotateString(String inputString, int n){
		// Write your code here
		StringBuffer result = new StringBuffer();

		//Rotate right
		if(n>0) 
		{

			int rotatedChars = inputString.length()-n;
			result.append(inputString.substring(rotatedChars, inputString.length()) 
					+ inputString.substring(0, rotatedChars));

		} 
		else if(n<0) 
		{ //Rotate left

			//Get positive value for shifting bits
			int m = n*-1;
			result.append(inputString.substring(m, inputString.length()) 
					+ inputString.substring(0, m));

		} else 
		{ //For n = 0 case, original string is ouput
			result.append(inputString);
		}


		return result.toString();
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		System.out.println("Enter pivot: ");
		int index = scan.nextInt();
		scan.close();
		String b = rotateString(a, index);
		System.out.println(b);
		
	}

}
