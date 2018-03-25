package test2;

import java.util.Scanner;

public class StringsOfLengthK {

	public static String[] allStrings(String charSet, int len)
	{
		char set[]=charSet.toCharArray();
		printAllKLength(set,len);
		String b[] =  new String[0];
		return b;
	}

	public static void printAllKLength(char set[], int k) 
	{
		int n = set.length;        
		printAllKLengthRec(set, "", n, k);
	}

	public static void printAllKLengthRec(char set[], String prefix, int n, int k) 
	{
		if (k == 0) 
		{
			System.out.println(prefix);
			return;
		}

		for (int i = 0; i < n; ++i) 
		{
			// Next character of input added
			String newPrefix = prefix + set[i]; 

			// k is decreased, because we have added a new character
			printAllKLengthRec(set, newPrefix, n, k - 1); 
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		System.out.println("Enter the size of window: ");
		int k = scan.nextInt();
		scan.close();
		String[] b = allStrings(a, k);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}

}
