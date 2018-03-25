package recursion3;

import java.util.Scanner;
/*
 * Given a string (lets say of length n), return all the subsequences of the given string.
Subsequences contain all the strings of length varying from 0 to n. But the order of characters 
should remain same as in the input string.
Note : The order of subsequences are not important.
 */
/* Sample Input 1
 * abc
 */
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
public class ReturnSubsequences {

	public static String[] subsequence(String input)
	{
		// Write your code here
		if(input.length()==0)
		{
			String ans[]= new String[1];
			ans[0]="";
			return ans;

		}
		String [] smallAns = subsequence(input.substring(1));
		String [] ans = new String[2*smallAns.length];

		for(int i=0;i<smallAns.length;i++)
		{ans[i]=smallAns[i];}

		for(int i=0;i<smallAns.length;i++)
		{ans[i+smallAns.length]=input.charAt(0)+smallAns[i];}
		return ans;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		scan.close();
		String b[] = subsequence(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
