package StringMethod;

import java.util.Scanner;

public class CaseStudy2 {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	StringBuffer bf=new StringBuffer();
	Car obj1=new Car();
	Bike obj2=new Bike();
	System.out.println("1.Car\n2.Bike");
	int n=s.nextInt();
	if(n==1)
	{
		System.out.println("Enter the details of car");
		System.out.println("Enter the color");
		bf.append("\nColor:"+s.next());
		System.out.println("Enter the maximum speed");
		bf.append("\nmaximum speed:"+s.next());
		System.out.println("Enter the number of seats");
		bf.append("\nnumber of seats:"+s.next());
		System.out.println("Enter the number of wheels");
		bf.append("\nnumber of wheels:"+s.next());
		System.out.println("Enter the number of doors");
		bf.append("\nnumber of doors:"+s.next());
		System.out.println("Enter the status of AC(true/false)");
		bf.append("\nAC:"+s.next());
		obj1.display(bf);
		
	}
	else if(n==2)
	{
		System.out.println("Enter the details of Bike");
		System.out.println("Enter the color");
		bf.append("\nColor:"+s.next());
		System.out.println("Enter the maximum speed");
		bf.append("\nmaximum speed:"+s.next());
		System.out.println("Enter the number of seats");
		bf.append("\nnumber of seats:"+s.next());
		System.out.println("Enter the number of wheels");
		bf.append("\nnumber of wheels:"+s.next());
		
		System.out.println("Enter the status of diskbreak(true/false)");
		bf.append("\nDisk Break:"+s.next());
		obj2.display(bf);
	}
	else
	{
		System.out.println("Invalid Option");
	}
	
}
	
	
}



class Vehicle
{
	
}
class Car extends Vehicle
{

	public void display(StringBuffer bf) {
		// TODO Auto-generated method stub
		System.out.println("Car Details:\n");
		System.out.println(bf);
	}
	
}
class Bike extends Vehicle
{

	public void display(StringBuffer bf) {
		// TODO Auto-generated method stub
		System.out.println("Bike Details:\n");
		System.out.println(bf);
	}
	
}