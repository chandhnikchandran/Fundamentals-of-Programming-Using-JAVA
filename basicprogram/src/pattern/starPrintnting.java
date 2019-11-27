package pattern;

import java.util.Scanner;

public class starPrintnting {
	public static void main(String [] args)
	  {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter Number:");
		 int n=s.nextInt();
		 int i,j,k;
		 for(i=0;i<n;i++)
		 {
			 for(j=0;j<=i;j++)
			 {
				 System.out.print("*");
				 //System.out.print(" ");
			 }
			 System.out.print(" ");
			 for(k=0;k<=i;k++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
		 
	  }
}
