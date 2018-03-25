package stacks_queues;

import java.util.Scanner;
import java.util.Stack;
/*
 * Given a string mathematical expression, return true if redundant brackets are present in the 
 * expression. Brackets are redundant if there is nothing inside the bracket or more than one pair 
 * of brackets are present.
 */
/*
 * Assume the given string expression is balanced and contains only one type of bracket i.e. ().
 */
/* Sample Input 1      Sample Output 1
 * ((a + b))           true
 */
/* Sample Input 2      Sample Output 2
 * (a+b)               false
 */
public class CheckRedundantBrackets {

	public static boolean checkRedundantBrackets(String input) 
	{
		Stack<Character> s = new Stack<Character>();

		boolean flag = false;
		for(int i = 0; i < input.length(); i++) 
		{
			if(input.charAt(i) != ')') 
			{
				s.push(input.charAt(i));
			}
			else 
			{
				while(s.peek() != '(') 
				{
					s.pop();
					flag = true;
					if(s.isEmpty()) 
					{
						break;
					}
				}
				if(s.isEmpty()) 
				{
					continue;
				}
				if(flag) 
				{
					s.pop();
					flag = false;
				}
				else 
				{
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Expression: ");
		String a = scan.nextLine();
		scan.close();
		System.out.println(checkRedundantBrackets(a));
	}

}
