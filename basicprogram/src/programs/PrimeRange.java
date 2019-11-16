package programs;

import java.util.Scanner;

public class PrimeRange {
	
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Limit1:");
		int n=s.nextInt();
		System.out.println("Enter Limit2:");
		int m=s.nextInt();
		int f=0,i;
		while(n<m)
		{
			f=0;
			for(i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					f=1;
					break;
				}
				else
				{
					f=0;
				}
				
			}
			if(f==0)
			{
				System.out.printf("%d ",n);	
			}
			n++;
		}
		
		
	}

}
