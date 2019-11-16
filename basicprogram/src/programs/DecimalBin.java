package programs;

import java.util.Scanner;

public class DecimalBin {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a Decimal value:");
	int n=s.nextInt();
int x[]=new int[10];
	int r,i=0,j;
	while(n!=0)
	{
		x[i]=n%2;
		i++;
		n=n/2;
	}
	for(j=i-1;j>=0;j--)
	{
		System.out.printf("%d",x[j]);
	}
}
}
