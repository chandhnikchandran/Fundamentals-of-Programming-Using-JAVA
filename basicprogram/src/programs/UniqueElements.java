package programs;

import java.util.Scanner;

public class UniqueElements {

	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=s.nextInt();
		int a[]=new int[n];
		int i,j;
		System.out.println("Enter Values:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
			 {
				if(a[i]==a[j])
				{
					break;
				}
			 }
			if(i==j)
			{
			System.out.print(a[i]+" ");
			}
			
		}
		
	}
}
