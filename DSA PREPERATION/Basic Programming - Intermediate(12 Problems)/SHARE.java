import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
// 		int t = sc.nextInt();
		
// 		while(t-- > 0 ){
		    int n = sc.nextInt();
		    
		    int m = sc.nextInt();
		    
		    long c = sc.nextLong();
		    
		    List<Long> a = new ArrayList<>();
		    
		    for (int i = 0 ; i < n ; i++ ) a.add(sc.nextLong());
		    
		    List<Long> b = new ArrayList<>();
		    
		    for (int i = 0 ; i < m ; i++ ) b.add(sc.nextLong());
		    
		    Collections.sort( a );
		    
		    Collections.sort( b );
		    
		    boolean flag = false;
		    
		    for( int i = n - 1 ; i >= 0 ; i-- ){
		        
		        if( Collections.binarySearch( b , c - a.get(i) ) > -1 ){
		            flag = true;
		            break;
		        }
		        
		    }
		    
		    if( flag ){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    
// 		}
	}
}