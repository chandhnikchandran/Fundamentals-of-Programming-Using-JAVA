package programs;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two no's");
		int a=s.nextInt();
		int b=s.nextInt();
		int m,i,gcd=0;
		if(a<b)
		{
			m=a;
		}
		else
			m=b;
		for(i=1;i<=m;i++)
		{
			if(a%i==0&&b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println(gcd);
	}

}
