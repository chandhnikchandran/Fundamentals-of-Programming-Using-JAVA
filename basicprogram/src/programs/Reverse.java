package programs;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=s.nextInt();
		int r;
		int sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println("Rverse no:"+sum);
	}

}
