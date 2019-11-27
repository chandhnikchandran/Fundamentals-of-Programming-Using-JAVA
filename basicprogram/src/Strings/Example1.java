package Strings;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String a=s.nextLine();//1st String..
		System.out.println("Enter String:");
		String b=s.nextLine();//2nd string..
		System.out.println("Enter String:");
		String c=s.nextLine();//3rd string..
		int len=a.length();//to find length..
		System.out.println("Length:"+len);//print length..
		char ch=a.charAt(4);//to find character at index 3
		System.out.println("charAt4:"+ch);//print char
		String sub=a.substring(2,4);//using substring method
		System.out.println("substring:"+sub);//print substring
		boolean startw=a.startsWith("this");//using startswith method
		System.out.println("startwith:"+startw);//print startwith..
		int index=a.indexOf("is");//find index no. of is in the 1st string ..
		System.out.println("index=>"+index);//print index value...
		String ac=a.concat(c);//concat a and c...
		System.out.println("concat:"+ac);
		String rep=b.replace("t","T");//replace with t to T..
		System.out.println("relace:"+rep);
		String sp[]=a.split(" ");//split the a string..
		int i;
		for(i=0;i<sp.length;i++)
		{
		System.out.println(" Strings split:"+sp[i]);//print the splited strings..
		}
		boolean bc=b.equals(c);//check the two string are equal or not..
		System.out.println("is equal:"+bc);
		
		
		
		
		
	}

}
