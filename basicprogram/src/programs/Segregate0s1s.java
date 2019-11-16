package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Segregate0s1s {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		System.out.println("Enter elements:");
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int left=0;
		int right=n-1;
		while(left<right)
		{
			while(a[left]==0&&left<right)
			{
				left++;
			}
			while(a[right]==1&&left<right)
			{
				right--;
			}
			if(left<right)
			{
				a[left]=0;
				
				a[right]=1;
				left++;
				right--;
			}
		}
		String b=Arrays.toString(a);
		System.out.println(b);
	}
}
