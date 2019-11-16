package programs;

import java.util.Scanner;

public class RemoveMultipleOccurence {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=s.next();
		int i;
		if(str.equals(""))
		{
			System.out.println("");
		}
		int len=str.length();
		if(len<=1)
		{
			System.out.println(str);
		}
		char c[]=str.toCharArray();
		char temp=c[0];
		StringBuilder sb=new StringBuilder(len);
		for(i=1;i<len;i++)
		{
			char val=c[i];
			if(val!=temp)
			{
				sb.append(temp);
				temp=val;
			}
		}
		sb.append(temp);
		System.out.println(sb.toString());
	}
}
