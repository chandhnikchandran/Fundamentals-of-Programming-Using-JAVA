package pattern;

import java.util.Scanner;

public class PatternHashStar {
	
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=s.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n*2+1;j++)
			{
				if(i+j==7||j==i+5)
				{
					System.out.print("*");
				}
				else {
				System.out.print("#");
				}
				
			}
			
			
			System.out.println();
		}
		
	}

}
