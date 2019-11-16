package programs;

import java.util.Scanner;

public class Stringsort {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=s.next();
		int i;
		String str2="";
		int l=str.length();
		for(i=l/2;i<l;i++)
		{
			str2=str2+str.charAt(i);
		}
		for(i=0;i<l/2;i++)
		{
			str2=str2+str.charAt(i);
		}
		
			System.out.printf(str2);
		
	}

}
