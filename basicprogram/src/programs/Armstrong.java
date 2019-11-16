package programs;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=s.nextInt();
		int m=n,p=n,c=0,r;
		double x=0;
		while(n!=0)
		{
			n=n/10;
			c++;
		}
		while(p!=0)
		{
			r=p%10;
			x=x+Math.pow(r,c);
			p=p/10;
		}
		if(m==x)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}
