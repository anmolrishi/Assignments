package recursion4;

import java.util.Scanner;
/*
 * Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. 
 * Write a program to print the list of all possible codes that can be generated from the given 
 * string. Note : The order of codes is not important.
 */
/* Sample Input 1 
 * 1123
 */
/* Sample Output 1
 * aabc
   kbc
   alc
   aaw
   kw
 */
public class PrintAllCodes {

	public static void printAllPossibleCodes(String input) 
	{
		code(input," ");
	}

	public static void code(String input,String n)
	{
		if(input.length()==0)
		{ System.out.println(n);return ;}
		if(input.length()==1)
		{ System.out.println((char)(input.charAt(0)+48)+n);return ;}

		char ch = (char)(input.charAt(input.length()-1)+48);
		code(input.substring(0,input.length()-1),ch+n);
		int v = convert (input.substring(input.length()-2));
		if(v>=10 && v<=26)
			code(input.substring(0,input.length()-2),(char)(v+96)+n);
	}

	public static int convert(String input)
	{
		if(input.length()==0){
			return 0;
		}
		String anew = "";
		anew = input.substring(1);
		int n = convert(anew);

		int num = ((int)(input.charAt(0))-48)*(int)Math.pow(10,anew.length())+n;
		return num;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string: ");
		String n = s.nextLine();
		s.close();
		printAllPossibleCodes(n);
	}

}
