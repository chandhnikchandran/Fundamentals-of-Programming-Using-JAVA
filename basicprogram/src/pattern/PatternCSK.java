package pattern;

import java.util.Scanner;

public class PatternCSK {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=s.nextInt();
		int i,j,k,p;
		for(i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("C");
			}
			for(k=0;k<i;k++)
			{
				System.out.print("S");
			}
			for(p=0;p<i;p++)
			{
				System.out.print("K");
			}
			System.out.println();
		}
		
	}
}
