package programs;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Limit:");
		int n=s.nextInt();
		int a=0,b=1,c=0,i;
		System.out.printf("%d %d ",a,b);
		
		for(i=2;i<n;i++)
		{
			c=a+b;
			System.out.printf("%d ",c);
			a=b;
			b=c;
			
		}
	}

}
