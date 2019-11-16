package programs;

import java.util.Scanner;

public class Greatest {
	
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int n1=s.nextInt();
		System.out.println("Enter 2nd number:");
		int n2=s.nextInt();
		System.out.println("Enter 3rd number:");
		int n3=s.nextInt();
		int x;
		if(n1>n2&&n1>n3)
		{
			x=n1;
		}
		else if(n2>n1&&n2>n3)
		{
			x=n2;
		}
		else
		{
			x=n3;
		}
		System.out.println("Greatest="+x);
		
	}

}
