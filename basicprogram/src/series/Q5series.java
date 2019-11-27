package series;

import java.util.Scanner;

public class Q5series {

	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=s.nextInt();
		int i;
		double x=0.5;
		for(i=0;i<n;i++)
		{
			System.out.printf("%.1f ",x);
			x=3*x;
			
		}
		
	}
}
