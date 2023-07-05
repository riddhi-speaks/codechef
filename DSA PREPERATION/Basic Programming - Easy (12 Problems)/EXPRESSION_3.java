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
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            boolean flag = false;
            if((a+b+c)==0)
            flag=true;
            else if((a+b-c)==0)
            flag=true;
            else if((a-b+c)==0)
            flag=true;
            else if((a-b-c)==0)
            flag=true;
            else if((-a+b+c)==0)
            flag=true;
            else if((-a+b-c)==0)
            flag=true;
            else if((-a-b+c)==0)
            flag=true;
            else if((-a-b-c)==0)
            flag=true;
            if(flag)
            System.out.println("Yes");
            else
           System.out.println("No"); 
        }  
	}
}
