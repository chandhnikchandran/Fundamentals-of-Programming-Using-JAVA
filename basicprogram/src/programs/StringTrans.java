package programs;

import java.util.Scanner;

public class StringTrans {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String1:");
		String str1=s.next();
		System.out.println("Enter string2:");
		String str2=s.next();
		int len1=str1.length();
		int len2=str2.length();
		int i,j,res=0;
		int c[]=new int[255];
		if(len1!=len2)
		{
			System.out.println("-1");
		}
		for(i=0;i<len1;i++)
		{
			c[str1.charAt(i)]++;
			c[str2.charAt(i)]--;
		}
		for(i=0;i<255;i++)
		{
			if(c[i]!=0)
			{
				System.out.println("-1");
			}
		}
		i=len1-1;
		j=len1-1;
		while(i>=0)
		{
			if(len1!=len2)
			{
				res++;
			}
			else
			{
				j--;
			}
			i--;
		}
		System.out.println(res);
	}

}
