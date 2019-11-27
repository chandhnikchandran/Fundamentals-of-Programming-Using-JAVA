package pattern;

import java.util.Scanner;

public class Pattern123 {
	public static void main(String [] args)
	  {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter no:");
	    int n=s.nextInt();
	    int i,j,k;
	    for(i=0;i<n;i++)
	    {
	    	for(k=n;k>=i;k--)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(j=i;j>=0;j--)
	    	{
	    		System.out.printf("%d ",j+1);
	    	}
	    	System.out.println();
	    }
	    
	  }
}
