package Strings;

import java.util.Scanner;

public class FindStringChar {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String n=s.nextLine();//1st String..
		String str[]=n.split(" ");
		int i,j;
		int vcount=0,upcount=0,locount=0,nocount=0,spcount=0,count=0,spacecount=0,ccount=0;
		for(i=0;i<str.length;i++)
		{
			int l=str[i].length();//to find length of each word.
			for(j=0;j<l;j++)//reverse the even position string..
			{
				char c=str[i].charAt(j);
				if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					vcount++;
				}
				if(c>='A'&&c<='Z')
				{
					upcount++;
				}
			if(c>='a'&&c<='z')
				{
					locount++;
				}
		 if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')
				{
					nocount++;
				}
		if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='%'||c=='^'||c=='&'||c=='*'||c==','||c=='.')
				{
					spcount++;
				}
		 if(c==' ')
				{
					spacecount++;
				}
			if(c>='a'&&c<='z'||c>='A'&&c<='Z')
				{
					count++;
				}
			}
			ccount=count-vcount;
			System.out.printf("\nvowel count:"+vcount);//after print space
			System.out.printf("\ncharacter count:"+ccount);
			System.out.printf("\nUp count:"+upcount);
			System.out.printf("\nLower count:"+locount);
			System.out.printf("\nnumber count:"+nocount);
			System.out.printf("\nSpace count:"+spacecount);
			System.out.printf("\nspecial character count:"+spcount);
			
			
			
				
		
					
			
		
		}
		
	}
}
