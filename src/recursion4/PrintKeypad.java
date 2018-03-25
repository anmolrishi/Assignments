package recursion4;

import java.util.Scanner;
/*
 * Given an integer n, using phone keypad find out and print all the possible strings that can be
 *  made using digits of input n.
Note : The order of strings are not important. Just print different strings in new lines.
 */
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
public class PrintKeypad {

	public static void printKeypadClass(int num, String[] m, String outputSoFar) {

		int lastDigit = num%10;
		String lastDigitOptions = m[lastDigit];


		if(num==0){
			System.out.println(outputSoFar);
			return ;
		}

		if(lastDigit==7 || lastDigit==9)
		{
			printKeypadClass(num/10, m, lastDigitOptions.charAt(0) + outputSoFar);
			printKeypadClass(num/10, m, lastDigitOptions.charAt(1) + outputSoFar);
			printKeypadClass(num/10, m, lastDigitOptions.charAt(2) + outputSoFar);
			printKeypadClass(num/10, m, lastDigitOptions.charAt(3) + outputSoFar);
		}

		else

		{
			printKeypadClass(num/10, m, lastDigitOptions.charAt(0) + outputSoFar);
			printKeypadClass(num/10, m, lastDigitOptions.charAt(1) + outputSoFar);
			printKeypadClass(num/10, m, lastDigitOptions.charAt(2) + outputSoFar);
		}
	}
	public static void printKeypad(int input){
		String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		printKeypadClass(input, map, "");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of the keypad: ");
		int n = s.nextInt();
		s.close();
		printKeypad(n);
	}

}
