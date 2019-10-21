package decisionmaking;

import java.util.Scanner;

public class Ifelseeg2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Name:");
		String n=s.nextLine();
		System.out.println("Password:");
		int p=s.nextInt();
		if(n=="A"&&p==1)
		{
			System.out.println("Sccess");
			
		}
		else
		{
		System.out.println("Not Sccess");
		}
	}
		

}
