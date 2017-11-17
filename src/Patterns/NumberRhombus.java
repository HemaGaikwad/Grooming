package Patterns;

public class NumberRhombus 
{
	public static void main(String args[])
	{
	int n=5,sp=n/2, st=1;
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<sp;j++)
	{
	System.out.print("  ");
	}
	int k=1;
	for(int j =0;j<st;j++)
	{
	System.out.print(k);
	if(j<st/2)
	k++;
	else
	k--;
	}
	if(i<n/2)
	{
	sp--;
	st=st+2;
	}
	else
	{
	sp++;
	st=st-2;
	}
	System.out.println();
	}
	}
	}


