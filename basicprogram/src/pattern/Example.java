package pattern;

import java.util.Scanner;

public class Example {
	
	
	  public static void main(String [] args)
	  {
	   Scanner s=new Scanner(System.in);
		  String str=s.next();
		  int n=s.nextInt();
		  int i,j;
		  char ch;
		  for(i=0;i<n;i++)
		  {
			for(j=0;j<=i;j++)
			{
				 ch=str.charAt(j);
				System.out.printf("%c ",ch);
			}
			  System.out.println();
		  }
		  for(i=n-1;i>0;i--)
		  {
			for(j=0;j<i;j++)
			{
				ch=str.charAt(j);
				System.out.printf("%c ",ch);
			}
			   System.out.println();
		  }
	  }
	}
	

