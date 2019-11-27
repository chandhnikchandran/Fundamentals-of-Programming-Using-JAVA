package StringMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CaseStudy1 {
	
public static void main(String[] arg)throws IOException
	
	{
		Scanner s=new Scanner(System.in);
	
		StringBuffer n=new StringBuffer();
		
		String x;
	    int i=1;
	do
	{
		
		System.out.println("Registration");
		System.out.println("Enter your name");//read name
		n.append("\nName:"+s.next());
		System.out.println("Enter your Address");//read address
		n.append("\nAddress:"+s.next());
		System.out.println("Contact Number");//read name
		n.append("\nContact Number:"+s.next());
		System.out.println("Email Id");//read name
		n.append("\nEmail:"+s.next());
		System.out.println("Enter Proof Type");//read name
		n.append("\nProof type:"+s.next());
		System.out.println("Enter Proof Id");//read name
		n.append("\nProof id:"+s.next());
		System.out.printf("Thank you for registering. Your id is %d...\n",i);
		i++;
		System.out.printf("Do you want to continue registration (y/n)?");
		x=s.next();
	}while(x.equals("y"));
	String y;
	
		do
		{
			System.out.printf("Update Email:");
			System.out.printf("\nEnter new Email id");
			n.append("\nEmail:"+s.next());
			System.out.printf("\nEmail updated");
			System.out.printf("\nDo you want to update the email id?(yes/no)");
			y=s.next();
		}while(y.equals("y"));
		
		System.out.printf("\nYour details are as follows....");
	System.out.println(n);
		
	}
	

}
