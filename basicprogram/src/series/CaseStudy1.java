package series;

import java.util.Scanner;

public class CaseStudy1 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length:");
		int n=s.nextInt();
		int i,sum=0,a=0,b=2,c=0,d=1,f=0;
		for(i=2;i<n;i++)
		{
			if(i%2==0)
			{
				a=a+b;
				//System.out.println(a);
				f=1;
			}
			else
			{
				c=c+d;
				//System.out.println(c);
				f=0;
			}
			
		}
		if(f==1)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(c);
		}
		
	}
}
