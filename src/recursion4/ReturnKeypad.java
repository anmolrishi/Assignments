package recursion4;
/*
 * Given an integer n, using phone keypad find out all the possible strings that can be made using 
 * digits of input n.
 */
import java.util.Scanner;
/* Sample Input 1       Sample Output 1
 * 23                   ad
                        ae
                        af
                        bd
                        be
                        bf
                        cd
                        ce
                        cf
 */
public class ReturnKeypad {
	public static String[] keypad1(int num,String[] map)
	{
		if(num==0)
		{
			String[] ans={""};
			return ans;
		}

		String smallAns[] = keypad1(num/10,map);
		int lastDigit = num%10;
		String lastDigitOptions = map[lastDigit];
		String ans[]= new String[smallAns.length*lastDigitOptions.length()];

		int k=0;

		for(int i=0;i<lastDigitOptions.length();i++)
		{
			for(int j=0;j<smallAns.length;j++)
			{
				ans[k]=smallAns[j]+ lastDigitOptions.charAt(i);
				k++;
			}
		}

		return ans;
	}
	
	// Return a string array that contains all the possible strings
	public static String[] keypad(int n)
	{
		// Write your code here
		String[]map ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		return keypad1(n,map);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of the keypad: ");
		int n = s.nextInt();
		s.close();
		String []ans = keypad(n);
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);	
		}
	}

}
