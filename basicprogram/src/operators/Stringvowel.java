package operators;
import java.util.Scanner;

public class Stringvowel {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size:");
		int size=s.nextInt();
		int i;
		System.out.println("enter items:");
		String[] n=new String[size];
		for(i=0;i<size;i++)
		{
		n[i]=s.next();
		}
		char c;
		for( i=0;i<size;i++)
		{
			c=n[i].charAt(0);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				System.out.println(n[i]);
			}
		}
		
		
	}

}
