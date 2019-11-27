package pattern;

import java.util.Scanner;

public class PatternDCBA {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=n;i>=0;i--)
		{
			for(j=i;j>=0;j--)
			{
			 System.out.printf("%c ",j+65);
			}
			System.out.println();
		}
	}
	

}
