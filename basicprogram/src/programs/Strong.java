package programs;

import java.util.Scanner;

public class Strong {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no:");
		int n=s.nextInt();
		int m=n;
		int r,i,sum=0;
		while(n!=0)
		{
			r=n%10;
			int f=1;
			for(i=1;i<=r;i++)
			{
				f=f*i;
			}
			sum=sum+f;
			n=n/10;
		}
		if(m==sum)
		{
			System.out.println("Strong");
		}
		else
		{
			System.out.println("Not Strongnumber");
		}
	}

}
