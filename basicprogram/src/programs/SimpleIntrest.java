package programs;

import java.util.Scanner;

public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int p=s.nextInt();
		System.out.println("Enter no:");
		int n=s.nextInt();
		System.out.println("Enter no:");
		int r=s.nextInt();
		
		double intrest=(p*n*r)/100;
		System.out.println("Simple Intrest: "+intrest);
	}
}
