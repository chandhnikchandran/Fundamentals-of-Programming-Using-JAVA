package programs;

import java.util.Scanner;

public class AddMatrix {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=s.nextInt();
		int i,j;
		System.out.println("enter 1st matrix values:");
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("enter 2nd matrix values:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.printf("%d\n",c[i][j]);
			}
		}
		
	}
}
