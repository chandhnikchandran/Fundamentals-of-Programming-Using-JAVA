package programs;

import java.util.Scanner;

public class Secondgreatest {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a=s.nextInt();
		System.out.println("Enter 2nd number:");
		int b=s.nextInt();
		System.out.println("Enter 3rd number:");
		int c=s.nextInt();
		int x;
		if(a>=b&&a>=c)
		{
			if(b>=c)
			{
			 x=b;
			}
			else
			{
				x=c;
			}
		}
		else if(b>=a&&b>=c)
		{
			if(a>=c)
			{
				x=a;
			}
			else
			{
				x=c;
			}
			
		}
		else if(a>=b)
		{
			x=a;
		}
		else
		{
			x=b;
		}
		System.out.println("2nd Greatest="+x);
		
	}

}
	


