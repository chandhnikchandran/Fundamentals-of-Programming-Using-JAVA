package programs;

import java.util.Scanner;

public class MaximumoccuringChar {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=s.next();
		int len=str.length();
		int i;
		int c[]=new int[255];
		for(i=0;i<len;i++)
		{
			c[str.charAt(i)]++;
		}
		int max=-1;
		char result=0;
		for(i=0;i<len;i++)
		{
			if(max<c[str.charAt(i)])
			{
				max=c[str.charAt(i)];
			}
			result=str.charAt(i);
		}
		System.out.println(result);
		
	}
}
