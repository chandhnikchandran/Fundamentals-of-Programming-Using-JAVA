package pattern;

import java.util.Scanner;

public class PatternAddNo {

	public static void main(String [] args)
	  {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter no:");
	    int n=s.nextInt();
	    int i,j,x=1,a=0,b=1,sum=0;
	    for(i=1;i<=n;i++)
	    {
	    	x=1;
	    	for(j=1;j<=i;j++)
	    	{
	    		
	    		System.out.print(x);
	    		x=x+j;
	    		//x=x+a;	
	    	}
	    	
	    	System.out.println();
	    }
	    
	  }
}
