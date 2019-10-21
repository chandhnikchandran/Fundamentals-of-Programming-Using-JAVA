package operators;

import java.util.Scanner;

public class Midpoint {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Input:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int x=(a+b)/2;
		int y=(c+d)/2;
		System.out.printf("%d,%d",x,y);
		
	}

		

}
