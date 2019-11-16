package primenumber;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=s.nextInt();
		int i,j,f=0;
		for(i=2;i<=n;i++)
		{
			for(j=i;j<=i;j++) {
				if(j==2) {
					f=0;
				}
				else if(j%2==0)
			  {
				f=1;
				break;
			  }
			else
			{
				f=0;
			}}
			if(f==0)
			{
				System.out.println(i);
			}
		}
	}

}
