package casestudy2;

import java.util.Scanner;

public class Check {

	static int booked[]=new int[25];
	void book() {
	String ac,pr="";String cot;String cable;String wifi;String laundry;
	Scanner s=new Scanner(System.in);
	int total,b=0,c,d,e,f,i=1;
int sta = 0;
do {
	System.out.println("1.Book\n2.Check Status\n3.Exit");
	System.out.println("Enter your choice");
	int n=s.nextInt();

	switch(n) {
	case 1:
	
	System.out.println("Booking");
	System.out.println("Please choose the service required");
	System.out.println("AC/non-AC(AC/nAC)");
	ac=s.next();
	if(ac.contentEquals("AC")==true) {b=1500;}
	else {b=700;}

	System.out.println("Cot(S/D)");
	cot=s.next();
	if(cot.contentEquals("S")==true) {c=50;}
	else {c=100;}

	System.out.println("Cable(C/nC)");
	cable=s.next();
	if(cable.contentEquals("C")==true) {d=50;}
	else {d=0;}

	System.out.println("Wifi(W/nW)");
	wifi=s.next();
	if(wifi.contentEquals("W")==true) {e=200;}
	else {e=0;}

	System.out.println("Laundry(L/nL)");
	laundry=s.next();
	if(laundry.contentEquals("L")==true) {f=100;}
	else {f=0;}
	total=b+c+d+e+f;
	System.out.println("The total charge is Rs."+total);
	System.out.println("The services chosen are");
	System.out.println(ac);
	System.out.println(cot);
	System.out.println(cable);
	System.out.println(wifi);
	System.out.println(laundry);
	System.out.println("Do you want to proceed");
	pr=s.next();

	if (pr.equals("yes")==true)
	{booked[i]=1;
	System.out.println("Thank you your room number is"+i);
	i=i+1;
	}if(pr.contentEquals("no"));
	break;
	case 2:
	System.out.println("Check Status");
	System.out.println("Enter your room number:");
	int i1=s.nextInt();
	if(booked[i1]==0) {
		sta=1;System.out.println("Sorry this room is not available");
	i1++;}
	else {sta=1;
	booked[i1]=1;
	System.out.println("Room number "+i1+" is booked");
	}
	
	case 3:
		return;
	
	}
}while(pr.contentEquals("yes") || pr.contentEquals("no") || sta==1);
	
	}
	}
