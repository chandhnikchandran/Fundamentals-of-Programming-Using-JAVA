package fibonacci;

import java.util.Scanner;

public class ScndLargest {

	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size:");
		int size=s.nextInt();
		int a[]=new int[size];
		int i,j;
		int t=0,b=0;
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<size-1;i++)
		{
			for(j=0;j<size-1;j++)
			{
			if(a[j]>a[j+1])
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
			}
		}
		
		System.out.println(a[size-2]);
	}
}
