package controlstr;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] arg)
	{
		
		Scanner s=new Scanner(System.in);
		String n=s.next();
		int l=n.length();
		int i,j,k,count=0;
		char c;
		for(i=0;i<l;i++)
		{
			c=n.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				
			count=count+1;
				for(j=0;j<count;j++)
				{
				System.out.print("*");
				
				}
				System.out.print(c);
				for(k=0;k<count;k++)
				{
				System.out.print("*");
				
				}
			  }
			else
			{
				System.out.print(c);
			}
		
		}
	}

}
