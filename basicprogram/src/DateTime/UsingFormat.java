package DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UsingFormat {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		LocalDateTime dt=LocalDateTime.now();//create dt object..
		System.out.println("Before Formatting:"+dt);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("E,MM-dd-yyyy hh:mm:ss");//create a format object
		String formatDate=dt.format(format);//save to formatDate 
		System.out.println("After Formatting:"+formatDate);//display after formatting...
		
	}
}
