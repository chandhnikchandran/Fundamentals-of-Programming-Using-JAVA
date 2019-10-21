package operators;

import java.util.Scanner;

public class Opeg {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Input:");
		int n=s.nextInt();
		int a=n%10;
		int b=n/10;
		int x=a*b;
		int y=a-b;
		System.out.printf("%d %d",y,x);
		
		
}
