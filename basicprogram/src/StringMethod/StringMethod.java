package StringMethod;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import.java.util.Scanner;

public class StringMethod {
	
	
	public static void main(String[] arg)throws IOException
	
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your first name");//read firstname
		StringBuffer name=new StringBuffer(br.readLine());
		System.out.println("Enter your last name");//read lastname..
		StringBuffer lastname=new StringBuffer(br.readLine());
		name.append(lastname);//append two strings..
		System.out.println("Enter your age");
		StringBuffer age=new StringBuffer(br.readLine());//read age
		System.out.println("Enter your gender");
		StringBuffer gender=new StringBuffer(br.readLine());//read gender
		System.out.println("Enter your employee id");
		StringBuffer id=new StringBuffer(br.readLine());//read employee id
		System.out.println("Enter your salary details");
		StringBuffer salary=new StringBuffer(br.readLine());//read salary
		System.out.println("Enter your address");
		StringBuffer address=new StringBuffer(br.readLine());
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(id);
		System.out.println(salary);
		System.out.println(address);
		
	}
	}
	


