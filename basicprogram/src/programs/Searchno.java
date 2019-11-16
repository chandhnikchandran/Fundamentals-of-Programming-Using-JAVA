package programs;

import java.util.Scanner;

public class Searchno {
	
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=s.nextInt();
		System.out.println("Enter elements:");
		int a[]=new int[n];
		int i,f=0;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter Search element");
		int x=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				f=1;
				break;
			}
			else
			{
				f=0;
			}
		}
		if(f==1)
		{
			System.out.println("Element Founded position is:"+(i+1));
		}
		else
		{
			System.out.println("The Entered element is not found....");
		}
		
	}

}
