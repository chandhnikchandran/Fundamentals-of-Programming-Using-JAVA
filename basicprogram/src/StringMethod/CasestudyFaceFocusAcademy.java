package StringMethod;

import java.util.Scanner;

public class CasestudyFaceFocusAcademy {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		String str3=s.next();
		int i;
		char ch1;
		char str1c[]=str1.toCharArray();
		for(i=0;i<str1c.length;i++)
		{
			ch1=str1.charAt(i);
			if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'||ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
			{
				str1c[i]='$';
			}
			
		}
		for(i=0;i<str1c.length;i++)
		{
			System.out.printf("%c",str1c[i]);
		}
		char ch2;
		char str2c[]=str2.toCharArray();
		for(i=0;i<str2c.length;i++)
		{
			ch2=str2.charAt(i);
			if(ch2!='A'&&ch2!='E'&&ch2!='I'&&ch2!='O'&&ch2!='U'&&ch2!='a'&&ch2!='e'&&ch2!='i'&&ch2!='o'&&ch2!='u')
			{
				str2c[i]='#';
			}
			
		}
		//System.out.println();
		for(i=0;i<str2c.length;i++)
		{
			System.out.printf("%c",str2c[i]);
		}
		
		String str3upper=str3.toUpperCase();
		System.out.println(str3upper);
	}
}
