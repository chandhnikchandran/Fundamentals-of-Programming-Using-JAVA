package decisionmaking;

import java.util.Scanner;

public class Nestedsh {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("size:");
		int size=s.nextInt();
		
		switch(size)
		{
		case 1:
			System.out.println("All cloths");
			break;
		case 2:
			System.out.println("which type person:" );
			char p=s.next().charAt(0);
			switch(p)
			{
			case 'M':
				System.out.println("mens cloths...");
				break;
			case 'W':
				System.out.println("womens cloths...");
				break;
			case 'K':
				System.out.println("Kids cloths...");
				break;
			}
			break;
		case 3:
			System.out.println("new ones:");
		case 'M':
			System.out.println("shirts,cloth,etc..");
			break;
		case 'W':
			System.out.println("churithar,top,etc..");
			break;
		case 'K':
			System.out.println("frock,top,kurtha,etc...");
			break;
					default:
				System.out.println("no items");
		}
	}

}
