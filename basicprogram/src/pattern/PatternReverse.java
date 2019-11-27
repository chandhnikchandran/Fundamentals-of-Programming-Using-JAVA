package pattern;

import java.util.Scanner;

public class PatternReverse {
	public static void main(String [] args)
	  {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter no:");
	    int n=s.nextInt();
	    int i,j,k,p;
	    for(i=0;i<n;i++)
	    {
	    	for(j=0;j<=i;j++)
	    	{
	    		System.out.print(j+1);
	    	}
	    	
	    	for(p=n-1;p>i;p--)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(k=i;k>=0;k--)
	    	{
	    		System.out.print(k+1);
	    	}
	    	System.out.println();
	    }
	    
	  }
}
