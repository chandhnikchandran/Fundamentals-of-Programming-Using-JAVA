package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class FirstMethod {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Today Date:");
		LocalDate date=LocalDate.now();//create date object..
		System.out.println(date);//display date..
		System.out.println("Current Time :");
		LocalTime time=LocalTime.now();//create time object..
		System.out.println(time);//display time..
		System.out.println("Today Date:");
		System.out.println("Today Date and Time:");
		LocalDateTime dt=LocalDateTime.now();//create dt object..
		System.out.println(dt);//display date and time..
		
		
	}
}
