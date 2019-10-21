package arrays;

import java.util.Scanner;

public class eg2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0,c=0,d=0,sum1=0;
		System.out.println("Enter 1st Size:");
		int size1=s.nextInt();
		int[] a=new int[size1];
		int[] b=new int[size1];
		int[] e=new int[size1];
		for(int i=0;i<size1;i++)
		{
			System.out.println("enter values:");
			a[i]=s.nextInt();
		}
		for(int i=0;i<size1;i++)
		{
			if(a[i]%2==0)
			{
				
				System.out.printf("%d\t",a[i]);
				sum=sum+a[i];
				c=c+1;
				
			}
		}
		System.out.printf("\n");
			for(int i=0;i<size1;i++)
			{
				if(a[i]%2!=0)
				{
					
					System.out.printf("%d\t",a[i]);
				sum1=sum1+a[i];
				d=d+1;
				
			    }
			}
			
			
		
			float av1=sum/c;
			float av2=sum1/d;
			
			System.out.printf("\n");
			System.out.println(av1);
			System.out.println(av2);
		
		

}
}
