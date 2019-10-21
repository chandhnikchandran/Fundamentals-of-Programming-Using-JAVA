package decisionmaking;

import java.util.Scanner;

public class Ladereg1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Mark:");
		int n=s.nextInt();
		if(n>90) {
			System.out.println("A");
			
		}
		else if(n>75&&n<90) {
			System.out.println("B");
		}
		else if(n>50&&n<75) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}

}
