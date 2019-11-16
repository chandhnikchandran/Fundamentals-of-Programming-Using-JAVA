package programs;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Year:");
		int y=s.nextInt();
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
				{
					System.out.println("Leap Year....");
				}
				else
				{
					System.out.println("Not a Leap Year....");
				}
			}
			else
			{
				System.out.println("Leap Year....");
			}
		}
		else
		{
			System.out.println("Not a Leap Year....");
		}
		
	}

}
