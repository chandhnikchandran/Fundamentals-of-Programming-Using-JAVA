package pattern;

import java.util.Scanner;

public class HelloPattern {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter String:");
	String str=s.next();
	int len=str.length();
	int i,j;
	char ch;
	for(i=0;i<len;i++)
	{
		for(j=0;j<=i;j++)
		{
			ch=str.charAt(j);
			System.out.printf("%c ",ch);
		}
		System.out.println();
	}
}
}
