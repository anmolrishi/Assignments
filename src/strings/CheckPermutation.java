package strings;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Given two strings, check if they are permutations of each other. Return true or false.
 * Permutation means - length of both the strings should same and should contain same set of 
 * characters. Order of characters doesn't matter.
 */
/*  Sample Input 1     Sample Output 1
 *  abcde              true
    baedc
 */
/*  Sample Input 2     Sample Output 2
 *  abc                false
    cbd
 */
public class CheckPermutation {

	public static boolean isPermutation(String input1, String input2) 
	{

		// Get lengths of both strings
		int n1 = input1.length();
		int n2 = input2.length();

		// If length of both strings is not same, then they 
		// cannot be anagram
		if (n1 != n2)
			return false;

		// Sort both the strings
		char[] chars1 = input1.toCharArray();
		Arrays.sort(chars1);

		char[] chars2 = input2.toCharArray();
		Arrays.sort(chars2);


		// Compare sorted strings
		for (int i = 0; i < n1;  i++)
			if (chars1[i] != chars2[i])
				return false;

		return true;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String a = scan.nextLine();
		System.out.println("Enter second String: ");
		String b = scan.nextLine();
		scan.close();
		System.out.println(isPermutation(a, b));
	}

}
