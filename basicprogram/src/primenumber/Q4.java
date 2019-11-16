package primenumber;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		double x=Math.sqrt(m);
		System.out.println(x);
		double n=x*x;
		int i;int c=0;
		for(i=2;i<=n;i++) {
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==1) {
			System.out.println("Prime");
		}
		else
		{
		System.out.println("Not a Prime");
		}
	}
}
