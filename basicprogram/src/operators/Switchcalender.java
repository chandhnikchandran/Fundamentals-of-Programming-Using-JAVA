package operators;
import java.util.Scanner;

public class Switchcalender {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter date:");
		String c=s.next();
		String str=""+s.charAt(3)+s.charAt(4)
		
		switch(str)
		{
		case "01":
			System.out.println("Jan");
			break;
		case "02":
			System.out.println("Feb");
			break;
		case "03":
			System.out.println("March");
			break;
		case "04":
			System.out.println("April");
			break;
		case "05":
			System.out.println("May");
			break;
		case "06":
			System.out.println("June");
			break;
		case "07":
			System.out.println("July");
			break;
		case "08":
			System.out.println("August");
		    break;
		case "09":
			System.out.println("Sept");
			break;
		case "10":
			System.out.println("Oct");
			break;
		case "11":
			System.out.println("Novm");
			break;
		case "12":
			System.out.println("Jan");
			break;
		
			
		}
		
		
	}

}
