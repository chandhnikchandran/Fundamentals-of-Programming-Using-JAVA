package series;

import java.util.Scanner;

public class Q2series {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=s.nextInt();
		int i,x=11,sum=0;
		for(i=1;i<=n;i++)
		{
			sum=x*x;
			System.out.printf("%d ",sum);
			x=x+4;
		}
		
	}
}
