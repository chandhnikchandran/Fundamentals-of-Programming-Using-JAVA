package programs;

import java.util.Scanner;

public class MaximumElementArray {

	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		int i,t=0;
		System.out.println("Enter values:");
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>t)
			{
				t=a[i];
			}
		}
		System.out.println("Maximum value:"+t);
	}
}
