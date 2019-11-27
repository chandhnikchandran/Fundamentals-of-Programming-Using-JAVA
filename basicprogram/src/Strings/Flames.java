package Strings;

import java.util.Scanner;

public class Flames {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		//System.out.println("Enter name1:");
		//String name1=s.nextLine();
		//System.out.println("Enter name2:");
		//String name2=s.nextLine();
		StringBuffer s1=new StringBuffer(s.nextLine());
		StringBuffer s2=new StringBuffer(s.nextLine());
		//String str1=name1.toUpperCase();
		//String str2=name2.toUpperCase();
		//int len1=str1.length();
		//int len2=str2.length();
		int i,j,count=0,f=0;
		char c,d,e='\0';
		for(i=0;i<s1.length();i++)
		{
			char ch1=s1.charAt(i);
			for(j=0;j<s2.length();j++)
			{
				char ch2=s2.charAt(j);
				if(ch1==ch2)
				{
				
					s1.replace(i, i+1, "0"); // replacing matching characters into "0"
                    s2.replace(j,j+1,"0");
				}
				
			}
			
		}
		int x1=0;
        int y1=0;
        String sb1="";
        String sb2="";
        sb1 = s1.toString();
        sb2 = s2.toString();
		
        for(i=0;i<s1.length();i++){ //length of string to remove 0 and find the length
            if(s1.charAt(i)!='0'){
                System.out.print(" "+s1.charAt(i));
                x1 +=1;
                
             }
        }
        System.out.println();
        System.out.println("First String: "+x1);

        for(i=0;i<s2.length();i++){
        if(s2.charAt(i)!='0'){
            System.out.print(" "+s2.charAt(i));
            y1 +=1;
            
            }
        } 
        System.out.println();
        System.out.println("Second String: "+y1);
   
    
    int x = x1+y1; // total length of remaining characters in both the strings
    System.out.println("Length is: "+x);
      
    
	}

}
