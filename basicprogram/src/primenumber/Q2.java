package primenumber;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		int n=s.nextInt();
		int m=s.nextInt();
		int i,j,f=0;
		for(i=n;i<=m;i++)
		{
			for(j=i;j<=i;j++)
			{
				if(i%2==0)
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
				System.out.println(i);
			}
		}
	}

}
