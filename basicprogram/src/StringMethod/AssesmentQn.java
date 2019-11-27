package StringMethod;

import java.util.Scanner;

public class AssesmentQn {

	
	  public static void main(String [] args)
	  {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter String:");
		  String str=s.next();
		  String ch[]=str.split(" ");
		  int i,j,count=0;
		  char c;
		  for(i=0;i<ch.length;i++)
		  {
			  String str2=ch[i].toUpperCase();
			  for(j=0;j<str2.length();j++)
			  {
			  c=str2.charAt(j);
			  if(c=='A')
			  {
				 count++; 
			  }
			  if(c=='E')
			  {
				 count++; 
			  }
			  if(c=='I')
			  {
				 count++; 
			  }
			  if(c=='O')
			  {
				 count++; 
			  }
			  if(c=='U')
			  {
				 count++; 
			  }
			  }
			  System.out.println(str2);
			  System.out.println(count);
			  
		  }
		  
		  
	  }
	}

