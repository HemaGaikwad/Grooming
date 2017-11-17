package Patterns;

import java.util.Scanner;

public class Star1 {
public static void main(String[] args) {
	int n,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number of lines");
	n=sc.nextInt();
		for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(i==0||i==n-1||j==0||j==n-1||i==j||i+j==n-1)
						System.out.print("* ");
					else
						System.out.print("   ");
				}
				System.out.println();
			}
	}
}

