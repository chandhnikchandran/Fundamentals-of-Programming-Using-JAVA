package pattern;

import java.util.Scanner;

public class PatterncskStar {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=s.nextInt();
		int i,j,k,p;
		for(i=0;i<n;i++)
		{
			if(i==0)
			{
			for(j=0;j<n;j++)
			{
				System.out.print("C");
			}
			System.out.println();
			}
			
			else
			{
			System.out.print("S");
			for(k=1;k<n-1;k++)
			{
				System.out.print("*");
			}
			System.out.print("S");
			System.out.println();
			}
			if(i==n-1)
			{
			for(p=0;p<n;p++)
			{
				System.out.print("K");
			}
			}
			
		}
		
	}
}
