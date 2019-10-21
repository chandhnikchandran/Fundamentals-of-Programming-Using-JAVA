package operators;

import java.util.Scanner;

public class hcflcm {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter num:");
		int a=s.nextInt();
		int b=s.nextInt();
		int i;
		int gcd=0,lcm=0;
		int min=(a<b)?a:b;
		for(i=min;i>0;i--)
		{
			if(a%i==0&&b%i==0)
			{
				gcd=i;
				break;
			}
		}
		System.out.println(gcd);
		int max=(a>b)?a:b;
		for(i=max;;i++)
		{
			if(i%a==0&&i%b==0)
			{
				lcm=i;
				break;
			}
		}
		System.out.println(lcm);
	}

}
