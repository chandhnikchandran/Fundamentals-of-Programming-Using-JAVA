package programs;

import java.util.Scanner;

public class ArcLength {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Radius:");
		double radius=s.nextDouble();
		System.out.println("Enter Angle:");
		double angle=s.nextDouble();
		double arclength;
		if(angle>360)
		{
			System.out.println("Invalid");
		}
		else
		{
			arclength=(2*3.14*radius)*(angle/360.0);
			System.out.printf("Arc_Length: %.2f",arclength);
		}
		
		
		
	}

}
