package programs;

import java.util.Scanner;

public class Nthfibo {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Limit:");
		int n=s.nextInt();
		int a=0,b=1,c=1,i;
		for(i=2;i<n;i++)
		{
			c=a+b;
			
			a=b;
			b=c;
			
		}
		System.out.printf("%d ",c);
	}
}
