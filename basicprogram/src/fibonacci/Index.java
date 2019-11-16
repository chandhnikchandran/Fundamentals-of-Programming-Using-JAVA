package fibonacci;

import java.util.Scanner;

public class Index {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=s.nextInt();
		
		int a=0,b=1,c=0,i;
		for(i=0;i<n-1;i++)
		{
			c=a+b;
			a=b;b=c;
		}
		System.out.println(c);
	}

}
