package programs;

import java.util.Scanner;

public class ReverseString {
	
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
		System.out.println(rev);
		
		//System.out.println("Rverse no:"+sum);
	}

}
