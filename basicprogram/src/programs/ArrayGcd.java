package programs;

import java.util.Scanner;

public class ArrayGcd {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Limit:");
		int n=s.nextInt();
		int a[]=new int[n];
		int i,x=1,j=1,f=0;
		int t=0;
		System.out.println("Enter No's:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<t)
			{
				t=a[i];
			}
		}
		for(i=0;i<n;i++)
		{
			if(t%a[i]==0)
			{
				f=1;
			}
			else
			{
				
			}
		}
		System.out.println(x);
	}
}
