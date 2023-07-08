import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	/* Here if any element of string is 0 then count the 0 in string if any element of string is other than 0 then add this count in count of 0. then the overall count by dividing by 1000000007 print the reminder by use modulo% operator.*/
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    long n=sc.nextLong();
		    String s=sc.next();
		    long count=0,count1=0;
		    for(int i=0;i<n;i++)
		    if(s.charAt(i)=='0')
		     count++;
		         else
		         count1=count1+count;
		    System.out.println(count1%1000000007);
		}
	}
}
