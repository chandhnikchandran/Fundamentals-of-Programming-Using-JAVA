package fibonacci;

import java.util.Scanner;

public class Check {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=s.nextInt();
		int m=n;
		int a=0,b=1,c=0;
		while(n>0)
		{
			c=a+b;
			a=b;
			b=c;
			n--;
		}
		if(m==c)
		{
			System.out.println("Fibanacci Number");
		}
		else
		{
			System.out.println("Not a Fibanacci Number");
		}
	}

}
