package decisionmaking;

import java.util.Scanner;

public class Ladereg {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Input:");
		int n=s.nextInt();
		int n1=s.nextInt();
		if(n=='A') {
			if(n1=='1') {
				System.out.println("A+ve");
				
			}else {
				System.out.println("A-ve");
			}
		}
		else if(n=='B') {
			if(n1=='1') {
				System.out.println("B+ve");
			}
			else {
				System.out.println("B-ve");
			}
		}
		else {
			System.out.println("Invalid");
		}
	}

}
