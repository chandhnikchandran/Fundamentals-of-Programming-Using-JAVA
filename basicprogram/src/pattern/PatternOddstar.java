package pattern;

import java.util.Scanner;

public class PatternOddstar {
	
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=s.nextInt();
		int i,j,k;
		//int m=n;
		
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.printf(" ");
			}
			for(k=1;k<=((i*2)-1);k++)//increasing order...
			{
				System.out.print("*");
			}
			
			System.out.println();
				
			
			
		}
		
		for(i=n-1;i>=1;i--)//decreasing order...
		{
			for(j=n;j>=i;j--)
			{
				System.out.printf(" ");
			}
			for(k=1;k<=((i*2)-1);k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
				
			
			
		}
	}
	

}
