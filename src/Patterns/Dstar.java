package Patterns;

public class Dstar 
 {
		public static void main(String[] args) {
		int n=5,st=1,k=1;
		for (int i=1;i<=n ;i++ )
		{
		for (int j=1;j<=n-i ;j++ )
		{
		System.out.print("  ");
		}
		for (int j=1;j<=st ;j++ )
		{
		System.out.print("*");
		}
		st+=2;
		System.out.println();
		}
		}
		}


