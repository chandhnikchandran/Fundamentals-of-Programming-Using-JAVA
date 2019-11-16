package programs;

import java.util.Scanner;

public class VowelConosanatUppercase {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=s.next();
		
		String newstr=str.toUpperCase();
		System.out.println(newstr);
	}
}
