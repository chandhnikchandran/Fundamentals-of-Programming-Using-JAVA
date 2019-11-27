package pattern;
import java.util.Scanner;
public class Patternchar {
	
	
	  public static void main(String [] args)
	  {
	    Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		  char a[]=new char[n];
		  int i,j;
		  for(i=0;i<n;i++)
		  {
			a[i]=s.next().charAt(0);  
		  }
		  for(i=0;i<n;i++)
		  {
			for(j=0;j<n;j++)
			{
				System.out.printf("%c ",a[i]);	
			}
			  System.out.println();
		  }
	  }
	}

