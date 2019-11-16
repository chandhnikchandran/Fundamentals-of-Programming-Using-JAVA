package palindrom;

import java.util.Scanner;

public class Perfect {
public static void main(String[] arg) {
	Scanner s=new Scanner(System.in);
	//Scanner s=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=s.nextInt();
	int m=n;
	int i=0,sum=0;
	for(i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(m==sum)
	{
		System.out.println("Perfect number...");
	}
	else
	{
		System.out.println("Not a Perfect number....");
	}
}
}
