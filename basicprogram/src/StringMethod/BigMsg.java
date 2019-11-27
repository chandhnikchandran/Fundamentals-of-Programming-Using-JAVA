package StringMethod;

import java.util.Scanner;

public class BigMsg {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		String str1="qwertyuiop[asdfghjkl;zxcvbnm,";
		System.out.println("Enter String:");
		String str2=s.next();
		System.out.println("Enter R/L:");
		char ch=s.next().charAt(0);
		int i,j;
		char ch1,ch2;
		for(i=0;i<str2.length();i++)
		{
			
			for(j=0;j<str1.length();j++)
			{
				//ch1=str1.charAt(i);
				//ch2=str2.charAt(j);
				if(str2.charAt(i)==str1.charAt(j)&&ch=='R')
				{
					System.out.printf("%c",str1.charAt(j-1));
				}
				else if(str2.charAt(i)==str1.charAt(j)&&ch=='L')
				{
					System.out.printf("%c",str1.charAt(j+1));
				}
			}
		}
	}
}
