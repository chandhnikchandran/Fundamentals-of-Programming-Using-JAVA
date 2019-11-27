package series;

import java.util.Scanner;

public class Q1series {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=s.nextInt();
		int i,c;
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				c=(i*i)-1;
			}
			else
			{
				c=(i*i)-2;
			}
			System.out.printf("%d,",c);
		}
		
	}
	
}
