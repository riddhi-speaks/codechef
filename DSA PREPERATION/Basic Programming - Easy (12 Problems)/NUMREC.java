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
		while(t-->0)
		{
		    long N = sc.nextLong();
		    long M= sc.nextLong();
		    
		     long subgrid = N*(N+1)*M*(M+1)/4 -N*M;
		    
		    System.out.println(subgrid);
		    
		}
	}
}
