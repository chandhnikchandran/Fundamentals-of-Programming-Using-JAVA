package basic;

import java.util.Scanner;

public class Sepstr {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("string1:");
		String a=s.nextLine();
		System.out.println("num:");
		int b=s.nextInt();
		s.nextLine();
		System.out.println("string2:");
		String c=s.nextLine();

		System.out.println("num:");
		int d=s.nextInt();
		s.nextLine();
		
		System.out.printf("%-15s %03d\n",a,b);
		
		System.out.printf("%-15s %03d\n",c,d);
	}
}
