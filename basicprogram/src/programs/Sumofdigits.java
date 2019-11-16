package programs;

import java.util.Scanner;

public class Sumofdigits {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter digits:");
		int n=s.nextInt();
		int r,sum=0,x,y=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		while(sum!=0)
		{
			x=sum%10;
			y=y+x;
			sum=sum/10;
		}
		System.out.println(y);
	}

}
