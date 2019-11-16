package palindrom;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] arg) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=s.nextInt();
	int m=n;
	int r,x=0;
	while(n!=0) {
		r=n%10;
		x=(x*10)+r;
		n=n/10;
	}
	if(m==x)
	{
		System.out.println("Palindrom");
	}
	else
	{
		System.out.println("Not a palindrom");
	}
	}

}
