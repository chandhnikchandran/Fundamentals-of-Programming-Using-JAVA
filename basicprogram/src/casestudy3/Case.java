package casestudy3;

import java.util.Scanner;
public class Case {
	public static void main(String[] arg) {
		Scanner s=new Scanner(System.in);
		System.out.println("Registration\n");
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Enter your address");
		String address=s.next();
		System.out.println("Contact Number");
		String contactnumber=s.next();
		System.out.println("E-mail ID");
		String email=s.next();
		System.out.println("Enter Proof type");
		String prooftype=s.next();
		System.out.println("Enter Proof id");
		String proofid=s.next();
		String pr="";
		
		Registration r=new Registration(name,address,contactnumber,email,prooftype,proofid);
		r.display(name,address,contactnumber,email,prooftype,proofid);
		System.out.println("Do you want to continue registration(y/n)");
		pr=s.next();
		if (pr.equals("y")==true)
		{
			r.update(name,address,contactnumber,email,prooftype,proofid);
			
		}
		else
		{
			return;
		}
	}

}
