package programmingFundamentals2;

import java.util.Scanner;
/* Sample Input 1    Sample Output 1
 *   10              3
 */
/* Sample Input 2    Sample Output 2
 *   4               2
 */
public class SquareRootIntegral {

	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        
        scan.close();
        
        if(n<0)
        {
            System.out.println("-1");
        }
        
        else
        {
        double x = Math.sqrt(n)-0.5;
        int sq = (int)Math.round(x);
        System.out.println(sq);
        }       
    }
}
