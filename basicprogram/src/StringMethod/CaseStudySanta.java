package StringMethod;

import java.util.Arrays;
import java.util.Scanner;

public class CaseStudySanta {
	
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter String1:");
		String str1=s.next();
		System.out.println("Enter String1:");
		String str2=s.next();
		System.out.println("Mixed String:");
		String str3=s.next();
		String str=str1.concat(str2);
		char tempstr[] =str.toCharArray();
		Arrays.sort(tempstr);
		char tempstr3[] =str3.toCharArray();
		Arrays.sort(tempstr3);
		String a=new String(tempstr);
		String b=new String(tempstr3);
		if(a.equals(b))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}


}
