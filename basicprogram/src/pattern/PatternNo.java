package pattern;

import java.util.Scanner;

public class PatternNo {
	public static void main(String [] args)
	  {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter Number:");
		 int n=s.nextInt();
		 int i,j;
		 for(i=1;i<=n;i++)
		 {
			 for(j=1;j<=n;j++)
			 {
				 if(i==j)
				 {
					 System.out.print("0");
				 }
				 else
				 {
					 System.out.print(i);
				 }
			 }
			 System.out.println();
		 }
		 
		 
	  }
}
