package programs;

import java.util.Scanner;

public class DcimalToOctal {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Decimal no:");
		long dn=s.nextLong();
		int on=0;
		
		int i=1;
		while(dn!=0)
		{
			on=(int) (on+(dn%8)*i);
			dn=dn/8;
			i=i*10;
		}
		System.out.println("Octal :"+on);
	}

}
