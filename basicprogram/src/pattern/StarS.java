package pattern;

import java.util.Scanner;

public class StarS {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=s.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			if(i==1)
			{
			for(j=1;j<n;j++)
			{
				if(j%2!=0)
				{
				System.out.print("*");
				}
				if(j%2==0)
				{
				System.out.print(" ");
				}
			}
			System.out.println();
			if(i==2)
			{
			for(j=1;j<=n;j++)
			{
				if(j==1||j==n)
				{
				System.out.print("*");
				}
				
				{
				System.out.print(" ");
				}
			}
			
			}
			}
			}
		}
		
}	
		
	

