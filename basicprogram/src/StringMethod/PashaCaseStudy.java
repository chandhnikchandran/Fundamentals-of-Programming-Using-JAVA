package StringMethod;

import java.util.Scanner;

public class PashaCaseStudy {
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
	    System.out.println("Enter the Pasha's string:");
	    String str=s.next();
	    System.out.println("Enter the number of days:");
	    int n1=s.nextInt();
	    System.out.println("Enter the position from which Pasha started transforming:");
	    int n2=s.nextInt();
	    System.out.println("The resultant string:");
	    int len=str.length();
	    int i;
	    char ch;
	    String sh="";
	    int m=(len-2)-1;
	    char[] temp=str.toCharArray(); //convert string to charArray...
	    
        for(i=(temp.length-n2)+1; i>0; i--)
        {
            System.out.print(temp[i]); //reverse order of array...
            
        } 
        System.out.printf("%c",temp[i]);
	}

}
