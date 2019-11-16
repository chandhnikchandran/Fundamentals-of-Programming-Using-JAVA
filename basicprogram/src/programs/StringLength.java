package programs;

import java.util.Scanner;

public class StringLength {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=s.next();
		int count=0;
		char ca[]=str.toCharArray();
		for(char c:ca)
		{
			count++;
		}
		System.out.println("String length:"+count);
		
	}
}
