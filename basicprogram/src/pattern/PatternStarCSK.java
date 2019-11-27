package pattern;

import java.util.Scanner;

public class PatternStarCSK {

	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=s.nextInt();
		int i,j,k,p;
		for(i=0;i<n;i++)
		{
			
			for(j=1;j<=n;j++)
			{
				if(i==0)
				{
				System.out.print("C");
				}
			}
			System.out.println();
			}
			
			//else
			{
				for(k=0;k<n;k++)
				{
					int x=i+k;
						if(x%2!=0)
						{
						System.out.print("*");
						}
						else
						{
						System.out.print("S");
						}
				}
			
				System.out.println();
				
				
			}
			if(i==n-1)
			{
			for(p=1;p<=n;p++)
			{
				System.out.print("K");
			}
			}
			
		}
		
	}

