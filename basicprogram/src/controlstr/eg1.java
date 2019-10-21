package controlstr;

import java.util.Scanner;

public class eg1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		int i=a,x=0;
		for(i=a;i<=b;i++)
		{
			x=x+i;
		}
		 
		System.out.println(x);
	}

}
