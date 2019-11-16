package programs;

import java.util.Scanner;

public class PalindromString {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String n=s.next();
		int l=n.length();
		int i;
		 String rev="";
		for(i=l-1;i>=0;i--)
		{
			rev=rev+n.charAt(i);
			
		}
		if(n.equals(rev))
		{
			System.out.println("Palindrom"+rev);
		}
		else
		{
			System.out.println("Not Palindrom"+rev);
		}
	}

}
