import java.util.*;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int X = 0;
		int Y = 0;
		int A = 0;
		for(int i=0; i<x; i++)
		{
		X = sc.nextInt();
		Y = sc.nextInt();
		A = sc.nextInt();
		if(X>= 20 && A<41)
		{
		if(A>= X && A<Y)
		System.out.println("YES");
		else
		System.out.println("NO");
		}
		else
		System.out.println("NO");
	} }
}
