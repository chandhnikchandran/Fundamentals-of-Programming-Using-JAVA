package palindrom;

import java.util.Scanner;

public class PaliString {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String:");
		String n=s.nextLine();
		
		int l=n.length();
		String m="";
		int i;
		for( i=l-1;i>=0;i--)
		{
			 m=m+n.charAt(i);
		}
		System.out.println(m);
		if(n.equals(m))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not a Palindrom");
		}
	}

}
