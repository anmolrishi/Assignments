package recursion2;

import java.util.Scanner;
/*
 * Given a string, compute recursively a new string where identical chars that are adjacent in the
 * original string are separated from each other by a "*".
 */
/* Sample Input 1     Sample Output 1
 * hello              hel*lo
 */
/* Sample Input 2     Sample Output 2
 * xxyy               x*xy*y
 */
/* Sample Input 3     Sample Output 3
 * aaaa               a*a*a*a
 */
public class PairStar {

	public static String addStars(String s)
	{
		// Write your code here
		if(s.length() < 2)
			return s;
		if(s.charAt(0) == s.charAt(1))
			return s.charAt(0) + "*" + addStars(s.substring(1));
		return s.charAt(0) + addStars(s.substring(1));

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = scan.nextLine();
		scan.close();
		String b = addStars(a);
		System.out.println(b);
	}

}
