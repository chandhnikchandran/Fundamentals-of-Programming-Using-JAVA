package controlstr;

import java.util.Scanner;
import java.util.Arrays;

public class Largest {
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
		Arrays.sort(a);
		{
			System.out.println(a[size-2]);
		}
		
		
		
	}

}
