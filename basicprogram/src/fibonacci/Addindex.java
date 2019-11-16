package fibonacci;

import java.util.Scanner;

public class Addindex {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=s.nextInt();
		
		int a=0,b=1,c=0,i;
		int sume=0,sumo=0;
		for(i=0;i<n-1;i++)
		{
			c=a+b;
			a=b;b=c;
			if(i%2==0)
			{
				sume=sume+c;
			}
			else
			{
				sumo=sumo+c;
			}
		}
		System.out.println("Sum of Even: "+sume);
		
		System.out.println("Sum of odd: "+sumo);
		
		//System.out.println(c);
	}
}
