import java.util.*;
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    int one = 0;
        int two = 0;
        int zero = 0;
		while(t>0)
		{
		  int n = sc.nextInt();
	      int k = sc.nextInt();  
	      one =  n/3;
	      two =  n/3;
	      zero =  n/3;
	      if(n%3==1)
	      {
	          one++;
	      }
	      else if(n%3==2)
	      {
	         one++;
	         two++;
	      }
	      if(k<=one)
	        System.out.println(((k-1) * 3) + 1);
	      else if(k<=one+two)
	        System.out.println((((k-one-1)) * 3) + 2);
	      else if(k<=one+two+zero)
	        System.out.println(((k-(one+two)) * 3));
	          
	          t--;
	      }
		sc.close();
	}
}
	      

