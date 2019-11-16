package programs;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number1:");
		int a=s.nextInt();
		System.out.println("Enter number2:");
		int b=s.nextInt();
		int max;
		int lcm=0;
		if(a>b)
		{
			max=a;
		}
		else
		{
			max=b;
		}
		while(a!=0)
		{
			if(max%a==0&&max%b==0)
			{
				lcm=max;
				break;
			}
			max++;
		}
		System.out.println("LCM="+lcm);
		
	}

}
