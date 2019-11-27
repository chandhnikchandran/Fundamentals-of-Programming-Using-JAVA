package StringMethod;

import java.util.Scanner;

public class RobaryCasestudy {
	public static void main(String[] arg) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No.of houses:");
		int n=s.nextInt();
		int i,m=0,sum=0,j=0,k,t=0;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{

			if(a[i]>m)
			{
				
			 m=a[i];
			 j=i;
			}
		}
		sum=sum+m;
		
		System.out.println(j);
		//for(j=0;j<n;j++)
		{
		for(i=0;i<n;i++)
		{

			m=0;
			if(i!=j&&i!=i-1&&i!=i+1)
			{
			if(a[i]>m)
			{
				
					m=a[i];
					j=i;
			}
			}
				
				
		}
		sum=sum+m;
		System.out.println(sum);
		}
	}
}
