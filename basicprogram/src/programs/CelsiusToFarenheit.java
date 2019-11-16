package programs;

import java.util.Scanner;

public class CelsiusToFarenheit {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter value in celsius:");
	float c=s.nextFloat();
	float f=(c*9/5)+32;
	System.out.println("in farenheit:"+f);
	
	
}
}
