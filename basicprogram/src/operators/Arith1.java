package operators;

import java.util.Scanner;

public class Arith1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Input:");
		int n=s.nextInt();
		
		int x=n%10;
		int y=n/10;
		int d=x*2;
		int e=y*2;
		System.out.printf("%d%d",d,e);
		System.out.println(" Input:");
		int m=s.nextInt();
		int m1=m%10;
		int m2=m/10;
		int p=m1*3;
		int q=m2*3;
		System.out.printf("%d%d",p,q);
		
	}

}
