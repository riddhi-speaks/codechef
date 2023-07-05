import java.util.*;
import java.io.*;

public class Codechef
{
	public static void main(String[] args) throws IOException
	{
		try{
		
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
		   
		        //y represents gain of points by monster, x=loss by monster..;, 
		        //ideally for us to win the monster's loss should be more ...otherwise we are losing, we wont defeat the bad guy.
		       
		   //long datatype is used for this problem
		    long h = in.nextLong();
		    long x = in.nextLong();
		    long y = in.nextLong();
		    if (x>y)
		        System.out.println(1);
		    else
		        System.out.println(0);
		    t--;
		}
		}catch(Exception e){
			return;
		}
	}
}