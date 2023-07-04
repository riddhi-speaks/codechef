/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

        while (t-- > 0) 
        {
            long n = sc.nextLong();
		    long x1 = sc.nextLong();
		    long x2 = sc.nextLong();
		    long x3 = sc.nextLong();
		    long x4 = sc.nextLong();
		    long x5 = sc.nextLong();
		    long x6 = sc.nextLong();
		    
		    long ans = x1  + x2 + x3  + x4  + x5 + x6;
		    
		    ans *= (long)Math.ceil( n * 0.5 ) ;
		    System.out.println(ans);
        }   
	}
}
