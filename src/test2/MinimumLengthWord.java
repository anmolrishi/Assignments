package test2;

import java.util.Scanner;

public class MinimumLengthWord {

	public static int wordCount(String s)
	{
		int count=0;
		 
		char ch[]= new char[s.length()];    
		 
		for(int i=0;i<s.length();i++)
		{
		    ch[i]= s.charAt(i);
		 
		    if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
		        count++;
		}
		return count;
	}
	
	public static String minLengthWord(String input)
	{
		int numwords = wordCount(input);
	    String[] words = input.split(" ");
	    String shortestword = words[0];
	    for (int i = 1; i < numwords; i++)
	    {
	    	if  (words[i].length() < shortestword.length()) 
	    	{
	            shortestword = words[i];
	        }
	    }
	    return shortestword;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		scan.close();
		String b = minLengthWord(a);
		System.out.println(b);
	}

}
