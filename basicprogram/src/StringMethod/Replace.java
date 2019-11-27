package StringMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Replace {
public static void main(String[] arg)throws IOException
	
	{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your first name");//read firstname
	StringBuffer name=new StringBuffer(br.readLine());
	System.out.println("Enter your last name");//read lastname..
	StringBuffer lastname=new StringBuffer(br.readLine());
	name.append(lastname);//append two strings..
    lastname.insert(2, "face");//insert 
	//System.out.println("append:"+name);
	//System.out.println("insert:"+lastname);
	name.delete(0, 5);//delete 0 to 5
	//System.out.println("delete:"+name);
	name.deleteCharAt(7);//delete current position char..
	//System.out.println("delete char:"+name);
	name.replace(1, 6, "welcome");//replace with welcome
	System.out.println(name);
	
	
	
}

}
