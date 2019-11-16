package fibonacci;

import java.util.Scanner;

public class Replacevowel {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		char c,v;
		int i,j,count=0;
		int l=n.length();
		String m=n.replaceAll("[aeiou]","&");
		System.out.println(m);	
			
	}
}
