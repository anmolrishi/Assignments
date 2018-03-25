package recursion4;

import java.util.Scanner;
/*
 * Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. 
 * Write a program to return the list of all possible codes that can be generated from the given 
 * string. Note : The order of codes are not important.
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
public class ReturnAllCodes {

	public static int convertStringToInt(String input)
	{
		// Write your code here
		if(input.length() == 1)
		{
			return input.charAt(0) - '0';
		}

		int smallOutput = convertStringToInt(input.substring(0, input.length()-1));
		int lastDigit = input.charAt(input.length()-1) - '0';
		return smallOutput*10 + lastDigit;
	}

	// Return a string array that contains all possible codes
	public static  String[] getCode(String input){
		// Write your code here

		if(input.length()==0)
		{
			String a[] ={""};
			return a;
		}

		String h = "";
		int i=0,k=0;
		h=input.substring(1);
		String m[]= getCode(h);
		String a[]= new String[m.length];

		for(i=0;i<m.length;i++)
			a[i]= (char) (input.charAt(0) + 48)+ m[i];

		int p=0;
		for(k=0;k<m.length;k++)
		{
			String q;

			if(m[k].compareTo("")==0) 
				break;

			else
				q=""+input.charAt(0) + (int)(m[k].charAt(0)-96);

			int v = convertStringToInt(q);

			if(v>=10 && v<=26)
			{
				String a1[] = new String[a.length+1];

				for(p=0;p<a.length;p++)
				{
					a1[p] = a[p];
				}

				if(m[k].length()>1)
					a1[p]= (char)(v+96) + m[k].substring(1,m[k].length());

				else
					a1[p]= ""+ (char)(v+96);

				a=a1;

			}
		} 


		return a;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string: ");
		String n = s.nextLine();
		s.close();
		String []ans = getCode(n);
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);	
		}

	}

}
