package programs;

import java.util.Scanner;

public class Toggle {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=s.next();
		int i;
		char a[]=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			if(a[i]>='A'&&a[i]<='Z')
			{
				a[i]=(char)((int)a[i]+32);
			}
			else if(a[i]>='a'&&a[i]<='z')
			{
				a[i]=(char)((int)a[i]-32);
			}
		}
		System.out.println("The Toggled String is...");
		for(i=0;i<str.length();i++)
		{
			System.out.printf("%c",a[i]);
		}
		
	}
}
