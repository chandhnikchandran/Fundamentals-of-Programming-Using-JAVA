package pattern;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=s.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}
