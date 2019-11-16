package programs;

import java.util.Scanner;

public class BinaryToOctal {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Binary no:");
	long bn=s.nextLong();
	int on=0,dn=0,i=0;
	while(bn!=0)
	{
		dn=(int) (dn+(bn%10)*Math.pow(2,i));
		i++;
		bn=bn/10;
	}
	i=1;
	while(dn!=0)
	{
		on=on+(dn%8)*i;
		dn=dn/8;
		i=i*10;
	}
	System.out.println("Octal :"+on);
}
}
