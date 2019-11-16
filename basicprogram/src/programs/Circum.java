package programs;

import java.util.Scanner;

public class Circum {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double r=s.nextDouble();
		 double circumference= 3.14*2*r;
		 System.out.println("Circumference="+circumference);
	}
}
