package programs;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=s.nextInt();
		int m=n,r,x=0;
		while(m!=0)
		{
			r=m%10;
			x=(x*10)+r;
			m=m/10;
		}
		if(n==x)
		{
			System.out.println("Palindrom "+x);
		}
		else
		{
			System.out.println("Not Palindrom "+x);
		}
	}

}
