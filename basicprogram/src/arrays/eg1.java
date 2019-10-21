package arrays;

import java.util.Scanner;

public class eg1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=s.nextInt();
		int[] a=new int[size];
		int[] b=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter 1st array values:");
			a[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println("enter 2nd array values:");
			b[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println("Sum of Arrays:");
			System.out.println(a[i]+b[i]);
		}
		
	}


}
