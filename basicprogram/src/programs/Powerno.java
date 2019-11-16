package programs;

import java.util.Scanner;

public class Powerno {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Base:");
		int n=s.nextInt();
		System.out.println("Enter Exponent:");
		int p=s.nextInt();
		int result=1,i;
		if(n>=0&&p==0)
		{
			result=1;
		}
		else if(n==0&&p>=0)
		{
			result=0;
		}
		else
		{
			for(i=1;i<=p;i++)
			{
				result=result*n;
			}
		}
		System.out.println(n+"^"+p+"="+result);
		
	}
}
