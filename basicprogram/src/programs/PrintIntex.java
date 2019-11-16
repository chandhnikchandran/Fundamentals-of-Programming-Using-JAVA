package programs;

import java.util.Scanner;

public class PrintIntex {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter value:");
	int n=s.nextInt();
	int m=n,f=0;
	int c=0,i,r,index=-1;
	while(n!=0)
	{
		n=n/10;
		c++;
	}
	System.out.println("Enter Searching value:");
	int x=s.nextInt();
	for(i=c;i>=0;i--)
	{
		r=m%10;
		if(r==x)
		{
			f=1;
			index=i;
			break;
		}
		m=m/10;
		
	}
if(f==1)
{
	System.out.println("The Value founded in "+index);
}
else
{
	System.out.println("Not Found "+index);
}
}
}
