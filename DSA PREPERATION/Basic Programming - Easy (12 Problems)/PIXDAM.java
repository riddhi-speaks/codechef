import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int H = sc.nextInt();
		    int W = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int K = sc.nextInt();
		    double c=0;
		 c=Math.sqrt((Math.pow((W-X),2))+(Math.pow((H-Y),2)));
		    if(c<K)
		    System.out.println("1");
		    else
		    System.out.println("0");
		}
	}
}
