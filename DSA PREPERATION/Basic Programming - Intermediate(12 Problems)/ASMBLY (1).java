import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nn = n;
		int  arr[]= new int[n];
		for(int i = 0; i<n; i++)
		{
		    arr[i] = sc.nextInt();
		for(int j=0; j<i; j++)
		{
		if(arr[j]>arr[i])
		{
		    nn--;
		    break;
		}
		}
		}
		System.out.println(nn);
	}
}
