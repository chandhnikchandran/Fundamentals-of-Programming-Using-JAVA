package pattern;

import java.util.Scanner;

public class PatternABC {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.printf("%c ",j+65);
			}
			System.out.println();
		}
	}

}
