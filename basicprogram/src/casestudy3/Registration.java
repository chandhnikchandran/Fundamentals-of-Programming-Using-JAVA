package casestudy3;

import java.util.Scanner;
class Registration{
	String name;
    String address;
    String contactnumber;
    String email;
    String prooftype;
    String proofid;
 Registration(String name,String address,String contactnumber,String email,String prooftype,String proofid) 
 {
	
	this.name=name;
	this.address=address;
	this.contactnumber=contactnumber;
	this.email=email;
	this.prooftype=prooftype;
	this.proofid=proofid;
	
	
}
void display(String name,String address,String contactnumber,String email,String prooftype,String proofid)
{
	
System.out.println("Registration\n");
System.out.println(name);
System.out.println(address);
System.out.println(contactnumber);
System.out.println(email);
System.out.println(prooftype);
System.out.println(proofid);
System.out.println("Thank you for registering. Your id is 1...");
}
void update(String name,String address,String contactnumber,String email,String prooftype,String proofid){
	Scanner s=new Scanner(System.in);
	System.out.println("Update Email");
	System.out.println("Enter your new Email id");
	String email1=s.next();
	System.out.println("Email Updated\n");
	System.out.println("Your details are as follows");
	System.out.println("name:"+name);
	System.out.println("Address:"+address);
	System.out.println("Contact Number:"+contactnumber);
	System.out.println("Email:"+email1);
	System.out.println("Proof Type:"+prooftype);
	System.out.println("Proof Id:"+proofid);
}


}