import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int x=0;
	    for(int i =0; i<n; i++)
	     {
	         x = sc.nextInt();
	         if(x>=2000)
	         System.out.println("Yes");
	         else
	         System.out.println("No");
	     }
	}
}
