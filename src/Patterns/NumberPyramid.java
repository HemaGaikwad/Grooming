package Patterns;

public class NumberPyramid 
{

	public static void main(String[] args) {
	 int n=5;
	 for (int i=0;i<n ;i++ )
	{
	for (int j=0;j<n-i-1 ;j++ )
	{
	 System.out.print("  ");
	}
	int k=i+1;
	int st=(2*i+1);
	for (int j=0;j<st ;j++ )
	{
	 System.out.print(k);
	 if(j<st/2)
	 k--;
	 else
	 k++;
	}
	System.out.println();
	 }}}
