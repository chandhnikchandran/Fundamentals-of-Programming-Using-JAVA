package pattern;

import java.util.Scanner;

public class PatternABCDEFG {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.printf("%c ",k+65);
				k++;
			}
			
		System.out.println();
		}
	}

}
