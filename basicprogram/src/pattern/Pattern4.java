package pattern;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=s.nextInt();
		int i,j,k;
		for(i=0;i<=n;i++)
		{
			for(j=n-i;j>1;j--)
			{
				System.out.printf(" ");
			}
			
			for(k=0;k<=i;k++)
			{
				
				System.out.print("* ");
					
			}
			System.out.println();	
		}
	}
}
