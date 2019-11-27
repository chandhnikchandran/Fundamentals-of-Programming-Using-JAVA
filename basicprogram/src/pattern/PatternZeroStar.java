package pattern;

import java.util.Scanner;

public class PatternZeroStar {
	public static void main(String [] args)
	  {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter no:");
	    int n=s.nextInt();
	    int i,j;
	    for(i=0;i<n;i++)
	    {
	    	for(j=0;j<n;j++)
	    	{
	    		if(i==j)
	    		{
	    			System.out.print("* ");
	    		}
	    		else if(i+j==n-1)
	    		{
	    			System.out.print("* ");
	    		}
	    		else
	    		{
	    			System.out.print("0 ");
	    		}
	    	}
	    	System.out.println();
	    }
	    
	  }
}
