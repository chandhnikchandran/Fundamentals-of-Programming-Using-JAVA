package programs;

import java.util.Scanner;

public class Hypotenuse {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter numbers:");
	int a=s.nextInt();
	int b=s.nextInt();
	int aa=a*a;
	int bb=b*b;
	int x=aa+bb;
	double hy=Math.sqrt(x);
	System.out.println("Hypotenuse="+hy);
	
	
}
}
