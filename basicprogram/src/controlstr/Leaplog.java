package controlstr;

import java.util.Scanner;

public class Leaplog {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter year:");
		int n=s.nextInt();
		
			
	
	
		if((n%4==0)&&(n%100==0)||(n%400==0))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println(" not a Leap year");
		}
	}
}
