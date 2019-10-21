package controlstr;

import java.util.Scanner;

public class Fibeg2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num :");
		int n=s.nextInt();
		int i;
		int a=0,d=0;
		int b=1;
		int c;
		for(i=0;i<n;i++)
		{
			c=a+b;
			if(c==n)
			{
				d++;
			}
			a=b;
			b=c;
		}
		if(d!=0)
		{
			System.out.printf("%d is fibonacci",n);
		}
		else
		{
			System.out.printf("%d is not fibonacci",n);
		}
	}

}
