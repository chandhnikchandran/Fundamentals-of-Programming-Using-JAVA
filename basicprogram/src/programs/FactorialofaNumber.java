package programs;

import java.util.Scanner;

public class FactorialofaNumber {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		int f=1,i;
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial="+f);
	}

}
