package programs;

import java.util.Scanner;

public class DeleteVowel {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=s.next();
		String newstr=str.replaceAll("[AEIOUaeiou]","");
		System.out.println(newstr);
	}

}
