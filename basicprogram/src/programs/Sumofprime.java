package programs;

import java.util.Scanner;

public class Sumofprime {

	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit:");
		int n=s.nextInt();
		int i,sum=2,j;
		for(i=0;i<n;i++)
		{
			for(j=2;j<n;j++)
			{
			if(j%i!=0)
			{
				sum=sum+j;
			}
			}
		}
		System.out.println("sum="+sum);
	}
}
