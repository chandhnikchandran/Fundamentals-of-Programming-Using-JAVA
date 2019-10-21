package operators;

import java.util.Scanner;

public class Arith2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Input:");
		int n=s.nextInt();
		
		int a=n%10;
		int b=a*a;
		int c=n/100;
		int d=c*a;
		int m=b*d;
		System.out.printf("%d%d\n",b,d);
		System.out.printf("%d",m);
		System.out.println(" Input:");
		int p=s.nextInt();
		int p1=p%10;
		int p2=p1*p1;
		int p3=p/100;
		int x=p3*p1;
		int y=p2*x;
		System.out.printf("%d%d\n",p2,x);
		System.out.printf("%d",y);
		
	}
}
