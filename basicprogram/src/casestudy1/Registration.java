package casestudy1;
import java.util.Scanner;

public class Registration {

String address;
int contactno;
String email;
String prooftype;
String proofid;
int i=1,j=1,k=1;
int a,b,c,d,e;
String bp,ps,rs;
String ac,sd,ca,w,l;
int date,date1,date2;
double total;
Scanner s=new Scanner(System.in);
String n[]=new String[25];
int id[]=new int[25];
int ro[]=new int[25];
	public void booking() {
		// TODO Auto-generated method stub
		
		do {
			System.out.println("Registration");
			System.out.println("Enter Your Name:");
			n[i]=s.next();
			i++;
			System.out.println("Enter Address:");
			address=s.next();
			System.out.println("Contact Number:");
			contactno=s.nextInt();
			System.out.println("Email Id:");
			email=s.next();
			System.out.println("Enter ProofType:");
			prooftype=s.next();
			System.out.println("Enter ProofId:");
			proofid=s.next();
			id[j]=j;
			System.out.printf("Thank you for registering. your Id is %d",j);
			j++;
			System.out.println("\nDo you want to book a room(y/n):");
			bp=s.next();
			
			if(bp.equals("y")) {
				booking1();
			}
				
		}while(bp.equals("n"));
		
	}
	public void view() {
		// TODO Auto-generated method stub
		
			System.out.println("\n Enter Start Date:");
			date1=s.nextInt();
			System.out.println(" Enter End Date:");
			date2=s.nextInt();
			if(date<=date1&&date<=date2)
			{
			System.out.printf(" The Booking made from %d to %d are:",date1,date2);
			System.out.println("\nRoomNumber \t name");
			System.out.println("\n==================");
			for(int p=1;p<i;p++) {
			
			System.out.printf("\n"+ro[p]+"\t\t"+n[p]);
			System.out.println();
		}
			System.out.println("==================");
			System.out.println("Thank you......");
			}
			else
			{
				System.out.println("No Booking..");
			}
	}
	public void booking1() {
	System.out.println("Booking");
	System.out.println("Ac/Non-Ac(a/n):");
	ac=s.next();
	if(ac.contentEquals("a")==true)
	{
		a=1500;
		}
	else 
	{
		a=700;
		}
	System.out.println("Single/Double(s/d):");
	sd=s.next();
	if(sd.contentEquals("s")==true)
	{
		b=50;
		}
	else 
	{
		b=100;
		}
	System.out.println("With cable connection/without cable connection(c/nc):");
	ca=s.next();
	if(ca.contentEquals("c")==true)
	{
		c=50;
		}
	else 
	{
		c=0;
		}
	System.out.println("Wifi needed or not(w/nw):");
	w=s.next();
	if(w.contentEquals("w")==true)
	{
		d=200;
		}
	else 
	{
		d=0;
		}
	System.out.println("Laundry service needed or not(l/nl):");
	l=s.next();
	if(l.contentEquals("l")==true)
	{
		e=100;
		}
	else 
	{
		e=0;
		}
	System.out.println("Enter Date of Bokking:");
	date=s.nextInt();
	total=a+b+c+d+e;
	System.out.printf("\nThe total charge is Rs.%.2f:",total);
	System.out.println("The services Chosen are:");
	if(ac.contentEquals("a")==true)
	{
		System.out.println("Ac");
		}
	else 
	{
		System.out.println("Non Ac");
	}
	if(sd.contentEquals("s")==true)
	{
		System.out.println("Single");
		}
	else 
	{
		System.out.println("Double");
		}
	if(ca.contentEquals("c")==true)
	{
		System.out.println("with cable");
		}
	else 
	{
		System.out.println("without cable");					
	}

if(w.contentEquals("w")==true)
{
	System.out.println("with wifi");
	}
else 
{
	System.out.println("without wifi");
	}
if(l.contentEquals("l")==true)
{
	System.out.println("with laundry");
	}
else 
{
	System.out.println("without laundry");
}
System.out.println("Do you want to proceed(y/n):");
ps=s.next();
if(ps.equals("y")) {
	ro[k]=k;
	System.out.printf("\nThank you for Booking. Your Room no is %d ",k);
	k++;
	
}
System.out.println("\nDo you want to continue regigistration(y/n):");
rs=s.next();
if(rs.equals("n")) {
	view();
}
else
{
	booking();
}
	}

}

