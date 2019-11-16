package palindrom;

import java.util.Scanner;

public class Amstrong {
public static void main(String[] arg) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=s.nextInt();
	int m=n;
	int p=n;
	int c=0;int pow=0;
	while(p!=0) {
		c++;
		p=p/10;
	}
	while(m!=0)
	{
		int r=m%10;
		 pow=(int) (pow+Math.pow(r,c));
		m=m/10;
	}
	if(n==pow)
	{
		System.out.println("The number is Amstrong...");
	}
	else
	{
		System.out.println("not an amstrong number");
	}
}
}
