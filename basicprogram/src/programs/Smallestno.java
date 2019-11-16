package programs;

import java.util.Scanner;

public class Smallestno {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Limit:");
		int n=s.nextInt();
		System.out.println("Enter values:");
		int a[]=new int[n];
		int i;
		int m=10000;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<m)
			{
				m=a[i];
			}
		}
		System.out.println("Smallest: "+m);
	}
}
