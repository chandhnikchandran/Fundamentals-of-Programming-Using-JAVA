package DateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class Example1 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		Guest obj1=new Guest();//create object obj
		Calendar calendar = Calendar.getInstance();
		System.out.println("Enter the name:");
		String name=s.next();
		System.out.println("Enter the Address:");
		String address=s.next();
		System.out.println("Number of room :");
		int noofroom=s.nextInt();
		System.out.println("Number of Persons :");
		int noofpersons=s.nextInt();
		System.out.println("AC/Non-AC:");
		String ac=s.next();
		System.out.println("Booking Date:");
		String start =s.next();// format 2017-11-20
		LocalDate ds = LocalDate.parse(start);
		System.out.println("Checkout date:");
		String end = s.next();//format like 2019-11-20
	    LocalDate de = LocalDate.parse(end);
	    long total = ChronoUnit.DAYS.between(ds,de);//differnce b/w booking and checkoutout date...
	    
	    int x=noofpersons/2;
	    int a=0,p,sum = 0;
	    int amount;
	    String acc="";
	    if(x<=noofroom)
	    {
	    	if(ac.equals("AC"))
	    	{
	    		acc="Yes";
	    		a=1150;
	    	}
	    	else
	    	{acc="No";
	    		a=1000;
	    	}
	    	if(noofpersons%2==0)
	    	{
	    		p=noofpersons*500;
	    	}
	    	else
	    	{int y=noofpersons-1;
	    		p=y*500+250;
	    	}
	    	sum=a+p;
	    	obj1.display(sum,total,name,address,noofroom,noofpersons,acc);
	    	//System.out.println(sum);
	    }
	    
	    else
	    {
	    	System.out.println("Book Another Room...");
	    }
	    
	}

}
class Guest
{

	public void display(int sum, long total, String name, String address, int noofroom, int noofpersons, String acc) {
		// TODO Auto-generated method stub
		int amount=(int) (total*sum);
	    System.out.println("Registration Details:\n");
	    System.out.println("Name:"+name);
	    System.out.println("Address:"+address);
	    System.out.println("No.of Rooms:"+noofroom);
	    System.out.println("No.of Guest:"+noofpersons);
	    System.out.println("AC:"+acc);
	    System.out.println("No.of Days:"+total);
	    System.out.println("Amount:"+amount);
	}
	
}