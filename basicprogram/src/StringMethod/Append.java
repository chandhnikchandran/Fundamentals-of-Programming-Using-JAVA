package StringMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Append {
public static void main(String[] arg)throws IOException
	
	{
	
	Scanner s=new Scanner(System.in);
	
	StringBuffer n=new StringBuffer();
	System.out.println("Name:");//read name
	n.append("Name->"+s.next()+"\nId->");
	System.out.println("Id:");//read id
	n.append(s.next());
	
	System.out.println(n);
	
	
	
	
	
	}

}
