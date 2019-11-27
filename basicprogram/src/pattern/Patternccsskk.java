package pattern;

import java.util.Scanner;

public class Patternccsskk {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=s.nextInt();
		int i,j,k,p;
		for(i=0;i<n;i++)
		{
			
			if(i==0||i==1)
			{
			for(j=0;j<n;j++)
			{
				
			System.out.print("C");
				
			}
			System.out.println();
			}
			if(i==2||i==3)
			{
			for(j=0;j<n;j++)
			{
				
			System.out.print("S");
				
			}
			System.out.println();
			}
			if(i==4||i==5)
			{
			for(j=0;j<n;j++)
			{
				
			System.out.print("K");
				
			}
			System.out.println();
			}
			
		}
		
	}
}
