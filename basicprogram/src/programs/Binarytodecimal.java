package programs;

import java.util.Scanner;

public class Binarytodecimal {
	
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Binary digit:");
	String bin=s.next();
	int dec=Integer.parseInt(bin,2);
	System.out.println(dec);
	}
}
