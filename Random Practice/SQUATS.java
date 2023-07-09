/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int x = 0;
	int T = sc.nextInt();
	if(1<=T && T<=1000)
	{
	for(int i = 1; i<=T; i++)
     { x = sc.nextInt();
     
     	if(1<=x && x<=100000)
     System.out.println(x*15);
     else
	System.out.println("invalid");
	}
	}
	else
	System.out.println("invalid");
     
	}
}
