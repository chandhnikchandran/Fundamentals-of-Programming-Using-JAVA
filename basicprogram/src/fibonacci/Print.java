package fibonacci;

import java.util.Scanner;

public class Print {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=s.nextInt();
		int a=0,b=1,c=1;
		System.out.println("The fibonacci Numbers are...");
		System.out.println(a);
		while(n>0)
		{
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;
			n--;
		}
		
	}

}
