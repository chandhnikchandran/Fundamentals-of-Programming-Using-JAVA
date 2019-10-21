package arrays;

import java.util.Scanner;

public class Maxnum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 1st Size:");
		int size=s.nextInt();
		int t=0;
		int[] a=new int[size];
		System.out.println("enter values:");
		for(int i=0;i<size;i++)
		{
			
			a[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]>=t)
			{
				t=a[i];
			}
		}
		System.out.println("high value");
		System.out.println(t);
	}

}
