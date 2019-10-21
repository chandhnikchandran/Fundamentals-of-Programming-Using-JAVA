package decisionmaking;

import java.util.Scanner;

public class Fallth {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		switch(n)
		{
		case 1:
		case 3:
		case 4:
		case 7:
		case 8:
			System.out.println("30 Days");
			break;
		case 6:
		case 11:
		case 12:
		System.out.println("31 Days");
		break;
		case 2:
			System.out.println("28 or 29 Days");
		default:
			System.out.println("error");
		}
	}

}
