package controlstr;

import java.util.Scanner;

public class Strongnum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r,fact,i=1,sum=0;
		System.out.println("Enter num:");
		int n=s.nextInt();
		int a=n;
		while(n!=0)
		{
			fact=1;
			r=n%10;
			for(i=1;i<=r;i++)
			{
				fact=fact*i;
				
			}
			sum=sum+fact;
			n=n/10;
			
		}
		if(sum==a)
		{
			System.out.println("Strong Num");
		}
		else
		{
			System.out.println(" not Strong Num");
		}
	}


}
