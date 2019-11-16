package programs;

import java.util.Scanner;

public class ReverseFibonacci {

	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n=s.nextInt();
		int a[]=new int[n];
		a[0]=0;
		a[1]=1;
		int i;
		for(i=2;i<n;i++)
		{
			a[i]=a[i-2]+a[i-1];
		}
		for(i=n-1;i>=0;i--)
		{
			System.out.printf("%d ",a[i]);
		}
	}
	
}
