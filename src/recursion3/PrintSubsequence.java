package recursion3;
/*
Given a string (lets say of length n), print all the subsequences of the given string.
Subsequences contain all the strings of length varying from 0 to n. But the order of characters 
should remain same as in the input string.
Note : The order of subsequences are not important. Print every subsequence in new line.
 */
import java.util.Scanner;
/* Sample Output 1
"" (the double quotes just signifies an empty string, don't worry about the quotes)
c 
b 
bc  
a 
ac 
ab 
abc
*/
public class PrintSubsequence 
{

	public static void printSubSeq(String input,String outsofar)
	{
		if(input.length()==0)
		{
			System.out.println(outsofar);
			return;
		}
		printSubSeq(input.substring(1),outsofar);
		printSubSeq(input.substring(1),outsofar+input.charAt(0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		scan.close();
		String b = "";
		printSubSeq(a, b);
	}

}
