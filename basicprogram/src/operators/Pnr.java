package operators;

import java.util.Scanner;

public class Pnr {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Input:");
		int p=s.nextInt();
		int n=s.nextInt();
		float r=s.nextFloat();
		int x=p*n;
		float y=x*r;
		float z=y/100;
		System.out.printf("%f",z);
	}
}
