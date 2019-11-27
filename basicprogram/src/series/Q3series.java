package series;

import java.util.Scanner;

public class Q3series {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=s.nextInt();
		int i;
		double a=1;
		double c=3.0,x;
		double b=2.0;
		System.out.printf("%.1f,%.1f",a,b);
		for(i=3;i<=n;i++)
		{
			if(i%2!=0)
			{
				x=a*c;
				a=x;
				System.out.printf(",%.1f",x);
			}
			else
			{
				x=b*c;
				b=x;
				System.out.printf(",%.1f,",x);
			}
			
		}
		
	}
}
