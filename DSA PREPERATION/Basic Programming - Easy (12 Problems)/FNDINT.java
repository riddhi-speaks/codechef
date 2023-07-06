/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0)
        {
            int x = sc.nextInt();
            int y= x+1;
            
            while(true)
            {  
                boolean flag = true;
                boolean[] digits = new boolean[10]; // to keep track of visited digits
             int Y=y;
            while (Y > 0) {
            int digit = Y % 10;

            if (digits[digit]) {
                flag = false;
                break;// found a repeated digit
            }

            digits[digit] = true;
            Y /= 10;
        }
        if(flag)
        {
            System.out.println(y);
            break;
        }
        else
        y++;
            }
        }
	}
}
