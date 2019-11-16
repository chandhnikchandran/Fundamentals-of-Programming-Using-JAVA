package primenumber;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] arg)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=s.nextInt();
	int i,f=0;
	for(i=2;i<=n/2;i++)
	{
		if(n%2==0)
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
		System.out.println("Prime Number");
	}
	else
	{
		System.out.println("Not a Prime Number");
	}
	
	
	
	}
}
