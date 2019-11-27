package DateTime;

import java.util.Calendar;
import java.util.Scanner;

public class UsingCalendarClass {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		   System.out.println("At present Calendar's Year:" + calendar.get(Calendar.YEAR));
		   System.out.println("At present Calendar's Day: " + calendar.get(Calendar.DATE));
		    System.out.println("The current date is : " + calendar.getTime());
		    calendar.add(Calendar.DATE, -7);//7 days ago 
		    System.out.println("7 days ago: " + calendar.getTime());
		   calendar.add(Calendar.MONTH, 10);//current month+10
		   System.out.println("10 months later: " + calendar.getTime());
		    calendar.add(Calendar.YEAR, 10);//current year+10
		    System.out.println("10 years later: " + calendar.getTime());
	}
}
