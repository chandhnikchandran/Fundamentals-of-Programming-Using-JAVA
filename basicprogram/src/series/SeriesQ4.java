package series;

import java.util.Scanner;

public class SeriesQ4 {

	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=s.nextInt();
		int i;
		int a=4,x;
		for(i=0;i<n;i++)
		{
			x=i*i+a;
			System.out.printf("%d ",x);
			a=x;
		}
		
	}
}
