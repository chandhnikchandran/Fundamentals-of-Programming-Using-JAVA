package programs;

import java.util.Scanner;

public class CharactorVC {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a charactor:");
		char c=s.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonent");
		}
		
		
		
	}

}
