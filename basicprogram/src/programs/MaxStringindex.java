package programs;

import java.util.Scanner;

public class MaxStringindex {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=s.nextLine();
		int i,y=0,m=0;
		int len=str.length();
		String x[]=str.split(" ");
		for(i=0;i<x.length;i++)
		{
			y=x[i].length();
			if(y>m)
			{
				m=y;
			}
			
		}
		
		
	for(i=0;i<x.length;i++)
		{
		if(m==x[i].length())
			{
				System.out.println("Longest word :"+x[i]);
			}
			
		}
	System.out.println(m);
	}

}
