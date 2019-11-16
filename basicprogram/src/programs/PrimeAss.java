package programs;

import java.util.Scanner;

public class PrimeAss {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,x=3,y=5,j;
		//System.out.printf("(%d %d)",)
		for(i=4;i<=n;i++)
		{
			for(j=2;j<=i;j++)
			{
			if(i%j!=0)
			{
			y=i;
			System.out.printf("(");
			System.out.printf("%d %d",x,y);
			System.out.printf(")");
			x=y;
			}
			}
			
		}
	}
	
}
