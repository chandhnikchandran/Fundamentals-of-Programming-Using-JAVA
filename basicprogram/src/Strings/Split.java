package Strings;

import java.util.Scanner;

public class Split {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String n=s.nextLine();//1st String..
		String str[]=n.split(" ");
		int i,j;
		for(i=0;i<str.length;i++)
		{
			
			if(i%2!=0)//to check the even position...
			{
				int l=str[i].length();//to find length of each word.
			for(j=l-1;j>=0;j--)//reverse the even position string..
			{

			   System.out.print(str[i].charAt(j));//print the reverse word
			}
			System.out.printf(" ");//after print space
			}
			else
			{
				
			System.out.print(str[i]+" ");//the position is even print the same word..
					
			}
		
		}
		
		
	}

}
